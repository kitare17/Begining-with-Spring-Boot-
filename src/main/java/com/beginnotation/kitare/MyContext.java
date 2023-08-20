package com.beginnotation.kitare;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyContext {
    public static void main(String[] args) {
        var context =new AnnotationConfigApplicationContext(MyAnnotation.class);
        System.out.println(context.getBean("getName"));
    }
}
