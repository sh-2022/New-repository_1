//package com.example.blogcms.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import com.example.blogcms.repository.UserRepository;
//import com.example.blogcms.service.UserDetailsServiceImpl;
//
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity  // 必要なら
//public class WebSecurityConfig {
//
//    private final UserRepository userRepository;
//    private final UserDetailsServiceImpl userDetailsService;
//
//    public WebSecurityConfig(UserRepository userRepository, UserDetailsServiceImpl userDetailsService) {
//        this.userRepository = userRepository;
//        this.userDetailsService = userDetailsService;
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/login", "/register", "/css/**", "/js/**").permitAll()
//                        .anyRequest().authenticated()
//                )
//                .formLogin(form -> form
//                        .loginPage("/login")
//                        .permitAll()
//                )
//                .logout(logout -> logout
//                        .logoutUrl("/logout")
//                        .permitAll()
//                )
//                .userDetailsService(userDetailsService);
//        return http.build();
//    }
//}