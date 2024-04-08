package Notes.AdderSubtractorSyncronised;


public class Subtractor implements Runnable{
    Count count;
  
    public Subtractor(Count count)
    {
        this.count=count;
       
    }

    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            synchronized(count)
            {
            count.value=count.value-i;
            }
        }
    }
}
