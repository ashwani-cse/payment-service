package com.service.payment.paymentservice.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author Ashwani Kumar
 * Created on 01/03/24.
 */

@Configuration
public class SecurityConfig {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .anyRequest().permitAll()
                )
                .oauth2ResourceServer(oauth2ResourceServer -> // Configure OAuth 2.0 Resource Server support
                        oauth2ResourceServer
                                .jwt(Customizer.withDefaults())
                );
        return http.build();
    }


}
