package com.Employee_Service.Filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class GatewayCheckFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        String requestPath=request.getRequestURI();
        if (requestPath.startsWith("/h2-console")){
            filterChain.doFilter(request,response);
            return;

        }
        String sourceHeader = request.getHeader("X-Source-System");

        if (sourceHeader==null || !sourceHeader.equals("Active-Gateway-Secured")){
            System.out.println("ALERT: Direct Access blocked");
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            response.getWriter().write("Direct Access Forbidden. Please use the API Gateway.");
            return;
        }
        filterChain.doFilter(request,response);
    }
}
