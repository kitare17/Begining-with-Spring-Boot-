package com.predestroy_and_postconstruct;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;



@Component
class Bean{
    private SubBean subBean;

    public Bean(SubBean subBean) {
        System.out.println("Initialization Bean");
        this.subBean = subBean;
    }
    @PostConstruct
    public void getOtherSource(){
        System.out.println("Get other source");
    }

    @PostConstruct
    public void getDatabase(){
        System.out.println("Get database");
    }
@PreDestroy
    public void cleanAll(){
    System.out.println("Clean all app");
}

}

@Component
class SubBean{


    public SubBean() {
        System.out.println("Initialization SubBean");
    }
}

@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        try(var context =new AnnotationConfigApplicationContext(Main.class))
        {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println("Done Main class");
        }
    }
}
