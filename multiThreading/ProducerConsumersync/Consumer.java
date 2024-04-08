package Notes.ProducerConsumersync;

import java.util.ArrayDeque;
import java.util.Queue;

public class Consumer implements Runnable{
    int maxSize;
    Queue<Object> queue=new ArrayDeque<>();
    String name;
    Consumer(int maxSize,Queue<Object> queue,String name)
    {
       this.maxSize=maxSize;
       this.queue=queue;
       this.name=name;
    }
    @Override
    public void run() {
        while(true)
        {
            synchronized(queue)
            {
               if(queue.size()>0)
            {
                System.out.println(name + "is consuming an element & size is " + queue.size());
                queue.remove();
            }
            }
            
        }
    }
    
}
