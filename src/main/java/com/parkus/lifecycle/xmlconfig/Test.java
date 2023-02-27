package com.parkus.lifecycle.xmlconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/parkus/lifecycle/xmlconfig/config.xml");

        Patient patient = (Patient) ctx.getBean("patient");

        System.out.println(patient);

        // pre shutdown hook
        ctx.registerShutdownHook();
    }
}
