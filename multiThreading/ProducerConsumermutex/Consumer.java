package Notes.ProducerConsumermutex;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable{
    int maxSize;
    Queue<Object> queue=new ArrayDeque<>();
    String name;
    Lock lock;
    Consumer(int maxSize,Queue<Object> queue,String name,Lock lock)
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
            if(queue.size()>0)
            {
                System.out.println(name + "is consuming an element & size is " + queue.size());
                queue.remove();
            }
            lock.unlock();
        }
    }
    
}
