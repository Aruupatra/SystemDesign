package Notes.ProducerConsumerSemaphore;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    int maxSize;
    Queue<Object> queue;
    String name;
    Semaphore producer;
    Semaphore consumer;
    Consumer(int maxSize,Queue<Object> queue,String name,Semaphore producer,Semaphore consumer)
    {
       this.maxSize=maxSize;
       this.queue=queue;
       this.name=name;
       this.producer=producer;
       this.consumer=consumer;
    }
    @Override
    public void run() {
        while(true)
        {
            
                try {
                    consumer.acquire();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println(name + "is consuming an element & size is " + queue.size());
                queue.remove();

                producer.release();
            
        }
    }
    
}
