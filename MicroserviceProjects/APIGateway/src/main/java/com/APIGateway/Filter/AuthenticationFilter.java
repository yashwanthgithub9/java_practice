package com.APIGateway.Filter;

import com.APIGateway.Util.JwtUtil;
import org.apache.http.HttpHeaders;
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
        return (((exchange, chain) -> {
            if (routeValidator.isSecured.test(exchange.getRequest())){
                if (!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)){
                    throw new RuntimeException("Auth Header not found");
                }

                String authHeader=exchange.getRequest().getHeaders().get(org.springframework.http.HttpHeaders.AUTHORIZATION).get(0);
                if (authHeader!=null && authHeader.startsWith("Bearer ")){
                    authHeader=authHeader.substring(7);
                }
                try {
                    jwtUtil.validateToken(authHeader);
                } catch (Exception e) {
                    System.out.println("invalid access...!");
                    throw new RuntimeException("Unauthorized entry");
                }
            }

            return chain.filter(exchange);
        }));
    }

    public static class Config {
    }
}
