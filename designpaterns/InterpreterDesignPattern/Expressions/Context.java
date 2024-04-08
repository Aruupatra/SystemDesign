package com.example.designpaterns.InterpreterDesignPattern.Expressions;

import java.util.HashMap;

public class Context {

    HashMap<String,Integer> map=new HashMap<>();

    public void put(String key,Integer value)
    {
        map.put(key,value);
    }

    public int get(String key)
    {
        return map.get(key);
    }
}
