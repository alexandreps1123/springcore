package com.parkus.dependencycheck;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
            "com/parkus/dependencycheck/config.xml");

        Prescription prescription = (Prescription) ctx.getBean("prescription");

        System.out.println(prescription);

    }
}
