package com.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("engine.xml");
        EngineService service=context.getBean("myHonda",EngineService.class);
        System.out.println(service.upgradeEngine());
    }
}
