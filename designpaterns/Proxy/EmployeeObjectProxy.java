package com.example.designpaterns.Proxy;

public class EmployeeObjectProxy implements ProxyInteface{

    EmployeeObject employeeObject=null;
    @Override
    public void process() {
        ///validateyion
        if(employeeObject==null)
        employeeObject=new EmployeeObject();

        employeeObject.process();

    }
}
