package com.parkus.cardealer;

import java.util.List;

class CarDealer {

    private String name;
    private List<String> models;

    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public List<String> getModels() 
    {
        return models;
    }

    public void setModels(List<String> models) 
    {
        this.models = models;
    }

}