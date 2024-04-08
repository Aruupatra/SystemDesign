package Notes.ProducerConsumer;

import java.util.ArrayDeque;
import java.util.Queue;

public class Producer implements Runnable{
     
    int maxSize;
    Queue<Object> queue=new ArrayDeque<>();
    String name;
    Producer(int maxSize,Queue<Object> queue,String name)
    {
       this.maxSize=maxSize;
       this.queue=queue;
       this.name=name;
    }
    @Override
    public void run() {
        while(true)
        {
            if(queue.size()<maxSize)
            {
                System.out.println(name + "is producing an element & size is " + queue.size());
                queue.add(new Object());
            }
        }
    }

    
}
