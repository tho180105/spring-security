/*
package com.example.security.security;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CorsFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("CorsFilter is processing the request.");
        // Cast ServletResponse to jakarta.servlet.http.HttpServletResponse
        jakarta.servlet.http.HttpServletResponse httpResponse = (jakarta.servlet.http.HttpServletResponse) response;
        jakarta.servlet.http.HttpServletRequest httpServletRequest = (jakarta.servlet.http.HttpServletRequest) request;
        httpServletRequest.setAttribute("Access-Control-Request-Headers","content-type");
        // Set CORS headers
        httpResponse.setHeader("Access-Control-Allow-Origin", "http://localhost:5173");
        httpResponse.setHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS");
        httpResponse.setHeader("Access-Control-Allow-Headers", "*");
        // Continue the filter chain
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // Cleanup code, if needed
    }
}
*/
