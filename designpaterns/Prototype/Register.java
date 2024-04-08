package com.example.designpaterns.Prototype;

import java.util.HashMap;

public class Register<x,y> {

     private x key;
     private y value;
    HashMap<x,y> map;
    public Register()
    {
        map=new HashMap<>();
    }

    public void addTemplate(x key,y value)
    {
        map.put(key,value);
    }

    public y getTemplate(String x)
    {
        if(map.containsKey(key))
        {
            map.get(key);
        }
        return null;
    }
}
