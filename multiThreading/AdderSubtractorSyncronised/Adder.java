package Notes.AdderSubtractorSyncronised;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    
    Count count;
    
    public Adder(Count count)
    {
        this.count=count;
    
    }

    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            synchronized(count)
            {
               count.value=count.value+i;
            }
            
            
        }
    }
    
}
