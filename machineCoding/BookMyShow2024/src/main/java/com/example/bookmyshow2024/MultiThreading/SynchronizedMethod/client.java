package com.example.bookmyshow2024.MultiThreading.SynchronizedMethod;

public class client {

    public static void main(String args[]) throws InterruptedException {
        Count count=new Count();

      //  Lock lock=new ReentrantLock();
        Adder adder=new Adder(count);

        Subtractor subtractor=new Subtractor(count);

        Thread thread1=new Thread(adder);
        Thread thread2=new Thread(subtractor);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(count.value);
    }
}
