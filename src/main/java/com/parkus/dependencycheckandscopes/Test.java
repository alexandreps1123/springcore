package com.parkus.dependencycheckandscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
            "com/parkus/dependencycheckandscopes/config.xml");

        University university = (University) ctx.getBean("university");

        System.out.println(university);

    }
}
