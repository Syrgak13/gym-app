//package com.gymmanagement;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(auth -> auth
//                        .anyRequest().permitAll() // Разрешить все запросы (Только для DEV!)
//                )
//                .csrf(csrf -> csrf.disable()); // Отключить CSRF, если нет форм авторизации
//
//        return http.build();
//    }
//}
