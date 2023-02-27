package com.parkus.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
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

    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside afterPropertiesSet()");
    }

    public void destroy() throws Exception {
        System.out.println("Inside destroy()");
    }

}
