package com.example.designpaterns.Decorator;

public class Client {
    public static void main(String[] ar)
    {
        Icecream icecream=new ChocolateSyrup(new Vanila(new ChocolateCone()));
        System.out.println(icecream.getDescription());
        System.out.println(icecream.getCost());

        System.out.println("DEBUG");
    }
}
