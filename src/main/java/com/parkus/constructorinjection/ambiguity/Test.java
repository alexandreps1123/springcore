package com.parkus.constructorinjection.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
            "com/parkus/constructorinjection/ambiguity/config.xml");

        Addition additionInt = (Addition) ctx.getBean("additionint");
        Addition additionDouble = (Addition) ctx.getBean("additiondouble");
        Addition addition = (Addition) ctx.getBean("addition");

        System.out.println(additionInt);
        System.out.println(additionDouble);
        System.out.println(addition);

    }
}
