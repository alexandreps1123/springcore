package com.parkus.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

    @PostConstruct
    public void  hi()
    {
        System.out.println("Inside Hi Method");
        System.out.println("Second Hi");
    }

    @PreDestroy
    public void  bye()
    {
        System.out.println("Inside Bye Method");
    }

    @Override
    public String toString() {
        return "Patient [id=" + id + "]";
    }


}
