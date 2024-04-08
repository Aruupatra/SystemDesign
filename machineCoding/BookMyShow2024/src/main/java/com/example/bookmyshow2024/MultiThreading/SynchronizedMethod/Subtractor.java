package com.example.bookmyshow2024.MultiThreading.SynchronizedMethod;

public class Subtractor implements Runnable{


    Count count;

    Subtractor(Count count)
    {
        this.count=count;

    }
    @Override
    public void run() {

        for(int i=1;i<=10000;i++)
        {
//            synchronized(count)
//            {
//                count.value=count.value-i;
//            }

            count.incValue(-i);


        }

    }
}
