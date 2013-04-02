package com.javapassion.examples;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("/beans.xml");
        InjectRef ref = (InjectRef)factory.getBean("injectRef");
        System.out.println(ref.getOracle().defineMeaningOfLife());
    }
    
}