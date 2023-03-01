package com.parkus.innerbeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
            "com/parkus/innerbeans/config.xml");

        Employee prescription = (Employee) ctx.getBean("employee");

        System.out.println(prescription);
    }
}
