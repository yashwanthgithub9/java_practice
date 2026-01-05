package com.APIGateway.Filter;

import com.APIGateway.Util.JwtUtil;
import org.springframework.http.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

import java.io.ObjectInputFilter;

@Component
public class AuthenticationFilter extends AbstractGatewayFilterFactory<AuthenticationFilter.Config> {

    @Autowired
    private RouteValidator routeValidator;

    @Autowired
    private JwtUtil jwtUtil;

    public AuthenticationFilter(){
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return ((exchange, chain) -> {

            // 1. Check if the request needs to be secured
            if (routeValidator.isSecured.test(exchange.getRequest())) {

                // --- AUTHENTICATION LOGIC START ---
                if (!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
                    throw new RuntimeException("missing authorization header");
                }

                String authHeader = exchange.getRequest().getHeaders().get(HttpHeaders.AUTHORIZATION).get(0);
                if (authHeader != null && authHeader.startsWith("Bearer ")) {
                    authHeader = authHeader.substring(7);
                }

                try {
                    // Validate token
                    jwtUtil.validateToken(authHeader);
                } catch (Exception e) {
                    System.out.println("invalid access...!");
                    throw new RuntimeException("unauthorized access to application");
                }
                // --- AUTHENTICATION LOGIC END ---

                // 2. Add the "Secret Handshake" Header (ONLY for secured requests)
                org.springframework.http.server.reactive.ServerHttpRequest request = exchange.getRequest()
                        .mutate()
                        .header("X-Source-System", "Active-Gateway-Secured")
                        .build();

                // 3. Forward the modified request
                return chain.filter(exchange.mutate().request(request).build());
            }

            // 4. If it's a public URL (like login), just let it pass without changes
            return chain.filter(exchange);
        });
    }

    public static class Config {
    }
}
