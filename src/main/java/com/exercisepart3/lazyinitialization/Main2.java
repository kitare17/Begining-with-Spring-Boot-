package com.exercisepart3.lazyinitialization;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component

class A{
    public A(){
        System.out.println("Create A class");
    }
}
@Component
@Lazy
class B{
    private A a;
    public B(A a){
        System.out.println("Create B class");
        this.a=a;
        
    }
}


@Configuration
@ComponentScan
public class Main2 {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(Main2.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
