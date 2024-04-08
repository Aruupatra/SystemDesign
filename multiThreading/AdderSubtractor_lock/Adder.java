package Notes.AdderSubtractor_lock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    
    Count count;
    Lock lock;
    public Adder(Count count,Lock lock)
    {
        this.count=count;
        this.lock=lock;
    }

    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            lock.lock();
            count.value=count.value+i;
            lock.unlock();
        }
    }
    
}
