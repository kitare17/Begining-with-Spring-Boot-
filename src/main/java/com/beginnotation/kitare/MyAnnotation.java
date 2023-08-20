package com.beginnotation.kitare;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAnnotation {

    @Bean
    public String getName(){
        return "My name is Kitare";
    }
}
