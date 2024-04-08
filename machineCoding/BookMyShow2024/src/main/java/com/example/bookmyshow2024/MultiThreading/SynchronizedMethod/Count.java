package com.example.bookmyshow2024.MultiThreading.SynchronizedMethod;

public class Count {
    public int value=0;
    public int getValue() {
        return value;
    }
    public synchronized void incValue(int val)
    {
        value=value+val;
    }
}
