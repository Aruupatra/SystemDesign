package com.example.bookmyshow2024.MultiThreading.SynchronizedMethod;

public class Adder implements Runnable{

    Count count;

    Adder(Count count)
    {
        this.count=count;

    }
    @Override
    public void run() {

        for(int i=1;i<=10000;i++)
        {
//           synchronized(count)
//            {
//                count.value=count.value+i;
//            }
            count.incValue(i);


        }

    }
}
