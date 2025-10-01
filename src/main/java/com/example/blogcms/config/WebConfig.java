package com.example.blogcms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.RequestDataValueProcessor;
import org.springframework.security.web.servlet.support.csrf.CsrfRequestDataValueProcessor;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    //@Bean
    //public RequestDataValueProcessor requestDataValueProcessor() {
    //    return new CsrfRequestDataValueProcessor();
    //}
}