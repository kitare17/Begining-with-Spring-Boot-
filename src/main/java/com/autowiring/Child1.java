package com.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Child1 implements Parent{
    @Override
    public void eat() {
        System.out.println("Child 1 Eat");
    }

    @Override
    public void speak() {
        System.out.println("Child 2 Speak");
    }
}
