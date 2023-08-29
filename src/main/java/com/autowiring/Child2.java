package com.autowiring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Child2 implements Parent{
    @Override
    public void eat() {
        System.out.println("Child 2 Eat");
    }

    @Override
    public void speak() {
        System.out.println("Child 2 Speak");
    }
}
