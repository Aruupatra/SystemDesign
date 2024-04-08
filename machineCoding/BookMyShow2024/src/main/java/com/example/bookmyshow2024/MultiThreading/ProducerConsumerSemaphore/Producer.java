package com.example.bookmyshow2024.MultiThreading.ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements  Runnable{

    String name;
    Queue<Object> queue;
    int maxSize;
    Semaphore producer;
    Semaphore consumer;
    public  Producer(String name,Queue<Object> queue, int maxSize, Semaphore producer,Semaphore consumer)
    {
        this.name=name;
       this.queue=queue;
       this.maxSize=maxSize;
       this.producer=producer;
       this.consumer=consumer;
    }


    @Override
    public void run() {
     while(true) {


         try {
             producer.acquire();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         queue.add(new Object());
         System.out.println(name + "Producer produced one product and remaining slots are " + queue.size());
         consumer.release();
     }
    }
}
