package com.example.bookmyshow2024.MultiThreading.ProducerConsumerSemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    String name;
    Queue<Object> queue;
    int maxSize;
    Semaphore producer;
    Semaphore consumer;
    public  Consumer(String name,Queue<Object> queue, int maxSize, Semaphore producer,Semaphore consumer)
    {
        this.name=name;
        this.queue=queue;
        this.maxSize=maxSize;
        this.producer=producer;
        this.consumer=consumer;
    }

    @Override
    public void run() {
   while (true) {


       try {
           consumer.acquire();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       queue.remove();
       System.out.println(name + "Consume consumed one product and remaining availables are " + queue.size());
       producer.release();
   }
    }
}
