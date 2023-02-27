package com.parkus.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/parkus/properties/propertiesconfig.xml");

        CountriesAndLanguages car = (CountriesAndLanguages) context.getBean("coutriesandlanguages");

        System.out.println(car.getCountryAndLangs());
        System.out.println(car.getCountryAndLangs().getClass().getName());
    }
}
