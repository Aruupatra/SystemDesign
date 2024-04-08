package com.example.designpaterns.BridgeDesignPattern;

import com.example.designpaterns.BridgeDesignPattern.Implementor.FishBreathe;
import com.example.designpaterns.BridgeDesignPattern.Implementor.NewBrathe;

public class Client {

    public static void  main(String[] ar)
    {

        Livinghood livinghood=new Fish(new FishBreathe());
        livinghood.breathProcess();


        //now let's say a new breath process is coming ,then we just add in implamentor

        Livinghood livinghood1=new Fish(new NewBrathe());
        livinghood1.breathProcess();
    }
}
