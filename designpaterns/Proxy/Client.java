package com.example.designpaterns.Proxy;

public class Client {
    public static void main(String ar[])
    {
        ProxyInteface obj=new EmployeeObjectProxy();
        obj.process();
        obj.process();
    }
}
