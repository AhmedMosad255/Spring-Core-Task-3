package com.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        PersonService personService = context.getBean("personService", PersonService.class);
        personService.savePerson("Mohamed");
        context.close();
    }
}
