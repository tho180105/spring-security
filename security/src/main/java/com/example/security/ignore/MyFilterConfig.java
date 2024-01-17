/*
package com.example.security.ignore;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MyFilterConfig {

    @Bean
    public FilterRegistrationBean<CorsFilter> myFilter() {
        FilterRegistrationBean<CorsFilter> registrationBean = new FilterRegistrationBean<>();
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOriginPatterns(Arrays.asList("https://localhost:5173"));
        configuration.setAllowedOrigins(Arrays.asList( "https://localhost:5173"));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "OPTIONS"));
        registrationBean.setFilter(new CorsFilter(request -> {
            return configuration;
        }));
        registrationBean.addUrlPatterns("/api/*"); // Specify the URL patterns to which this filter should be applied
        return registrationBean;
    }
}
*/
