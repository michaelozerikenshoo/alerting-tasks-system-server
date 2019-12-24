package com.alerting.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


public class MainApp {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        Object helloWorld = context.getBean("HelloWorld");
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//        obj.getMessage();
    }
}
