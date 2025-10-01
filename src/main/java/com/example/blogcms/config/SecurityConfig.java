//package com.example.blogcms.config;
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
//                        // ログインページ（GET）と静的リソースを認証不要にする
//                        .requestMatchers("/login", "/css/**", "/js/**", "/images/**", "/h2-console/**").permitAll()
//                        .anyRequest().authenticated()
//                )
//                .formLogin(form -> form
//                        .loginPage("/login")        // ログインページのパス
//                        .loginProcessingUrl("/login") // フォームの action がこのパスで POST される
//                        .defaultSuccessUrl("/", true) // 認証後のデフォルト遷移先
//                        .permitAll()
//                )
//                .logout(logout -> logout
//                        .logoutUrl("/logout")
//                        .logoutSuccessUrl("/login?logout")
//                        .permitAll()
//                )
//                .csrf(csrf -> csrf
//                        .ignoringRequestMatchers("/h2-console/**")
//                )
//                .headers(headers -> headers
//                        .frameOptions(frame -> frame.sameOrigin())
//                );
//
//        return http.build();
//    }
//}
