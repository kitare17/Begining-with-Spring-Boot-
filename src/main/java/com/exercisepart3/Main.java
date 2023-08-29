package com.exercisepart3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
  try(var context=new AnnotationConfigApplicationContext(Main.class))
  {
      Arrays.stream(context.getBean(BusinessCalculationService.class).retriveData()).forEach(System.out::println);
  }

    }
}
