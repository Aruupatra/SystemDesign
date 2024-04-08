package com.example.designpaterns.Proxy;

public class EmployeeObject implements ProxyInteface {

    public EmployeeObject()
    {
        System.out.println("Employee Object initiated");
    }
    @Override
    public void process() {
        System.out.println("Employee Proceess Done");
    }
}
