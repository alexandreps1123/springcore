package com.parkus.lifecycle.xmlconfig;

public class Patient {
    private int id;

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        System.out.println("First Set");
        this.id = id;
    }

    public void  hi()
    {
        System.out.println("Inside Hi Method");
        System.out.println("Second Hi");
    }

    public void  bye()
    {
        System.out.println("Inside Bye Method");
    }

    @Override
    public String toString() {
        return "Patient [id=" + id + "]";
    }

}
