package com.example.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean("myBeam")
    public HelloClass myFirstClass() {
        return new HelloClass("asd");
    }
}
