package Notes.ProducerConsumermutex;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{
     
    int maxSize;
    Queue<Object> queue=new ArrayDeque<>();
    String name;
    Lock lock;
    Producer(int maxSize,Queue<Object> queue,String name,Lock lock)
    {
       this.maxSize=maxSize;
       this.queue=queue;
       this.name=name;
       this.lock=lock;
    }
    @Override
    public void run() {
        while(true)
        {
            lock.lock();
            if(queue.size()<maxSize)
            {
                System.out.println(name + "is producing an element & size is " + queue.size());
                queue.add(new Object());
            }
            lock.unlock();
        }
    }

    
}
