package com.beginnotation.kitare;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class MyContext {
    public static void main(String[] args) {

        var context =new AnnotationConfigApplicationContext(MyAnnotation.class);
//        System.out.println(context.getBean("getName"));
//
//        //System.out.println(context.getBean(Person.class));
//        System.out.println(context.getBean("myperson"));
//        System.out.println(context.getBean("person1"));

        //System.out.println(context.getBean("getPerson"));


        //get all bean
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//        System.out.println(Arrays.stream(context.getBeanDefinitionNames()).count());



        System.out.println(context.getBean(AutoWiringLearn.class));
        System.out.println(context.getBean(String.class));


    }
}
