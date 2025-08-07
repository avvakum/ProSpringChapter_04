package com.avva.four.all;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AllInitMethodsDemo {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(MultiInitConfiguration.class);
    }
}
