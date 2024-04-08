package com.example.bookmyshow2024.MultiThreading.ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class client {
    public  static void main(String ar[])
    {
        Semaphore producer=new Semaphore(6);
        Semaphore consumer=new Semaphore(0);
        Queue<Object> queue=new ConcurrentLinkedQueue();
        int maxSize=6;
        Producer p1=new Producer("p1",queue,maxSize,producer,consumer);
        Thread t1=new Thread(p1);
        t1.start();

        Producer p2=new Producer("p2",queue,maxSize,producer,consumer);
        Thread t2=new Thread(p2);
        t2.start();

        Producer p3=new Producer("p3",queue,maxSize,producer,consumer);
        Thread t3=new Thread(p3);
        t3.start();

        Producer p4=new Producer("p4",queue,maxSize,producer,consumer);
        Thread t4=new Thread(p4);
        t4.start();

        Consumer c1=new Consumer("c1",queue,maxSize,producer,consumer);
        Thread t5=new Thread(c1);
        t5.start();

        Consumer c2=new Consumer("c2",queue,maxSize,producer,consumer);
        Thread t6=new Thread(c2);
        t6.start();

        Consumer c3=new Consumer("c3",queue,maxSize,producer,consumer);
        Thread t7=new Thread(c3);
        t7.start();



    }
}
