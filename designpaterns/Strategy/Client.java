package com.example.designpaterns.Strategy;

import java.util.Scanner;

public class Client {

    public static void main(String[] ar)
    {
//        PathCalculator calculator=new BikePathCalculator();
//        calculator.calculatePath("CTC","BBSR");

        Scanner sc=new Scanner(System.in);
        String mode=sc.nextLine();
        String from=sc.nextLine();
        String to=sc.nextLine();

        PathCalculator calculator=PathCalculatorFactory.getPathCalculator(mode);
        calculator.calculatePath(from,to);


    }
}
