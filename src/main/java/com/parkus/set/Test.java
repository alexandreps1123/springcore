package com.parkus.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/parkus/set/setconfig.xml");

        CarDealer car = (CarDealer) context.getBean("cardealer");

        System.out.println(car.getName());
        System.out.println(car.getModels());
        System.out.println(car.getModels().getClass().getName());
    }
}
