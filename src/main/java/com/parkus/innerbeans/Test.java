package com.parkus.innerbeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
            "com/parkus/innerbeans/config.xml");

        Employee employee = (Employee) ctx.getBean("employee");
        System.out.println(employee.hashCode());

        Employee employee2 = (Employee) ctx.getBean("employee");
        System.out.println(employee2.hashCode());
    }
}
