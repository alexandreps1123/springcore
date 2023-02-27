package com.parkus.setterinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/parkus/setterinjection/setterinjectionconfig.xml");

        ShoppingCart shoppingCart = (ShoppingCart) ctx.getBean("shoppingcart");

        System.out.println(shoppingCart.getItem());
    }
}
