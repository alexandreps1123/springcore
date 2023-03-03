package com.parkus.constructorinjection.ambiguity;

public class Addition {

    Addition(int a, int b)
    {   
        System.out.println("Inside constructor int");
    }

    Addition(double a, double b)
    {   
        System.out.println("Inside constructor double");
    }

    Addition(String a, String b)
    {   
        System.out.println("Inside constructor String");
    }
    
}
