package Notes.AdderSubtractorSyncronisedmethod2;


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
          count.incValue(-i);
        }
    }
}
