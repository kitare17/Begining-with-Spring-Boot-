package com.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        try( var context = new AnnotationConfigApplicationContext(Main.class))
        {
            context.getBean(Parent.class).eat();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        };

    }
}
