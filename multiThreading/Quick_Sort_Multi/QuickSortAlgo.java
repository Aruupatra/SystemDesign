package Notes.Quick_Sort_Multi;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class QuickSortAlgo implements Runnable{
   int[] arr;
   int lo;
   int hi;
   ExecutorService executorService;

   QuickSortAlgo(int[] arr,int lo,int hi,ExecutorService executorService)
   {
    this.arr=arr;
    this.lo=lo;
    this.hi=hi;
    this.executorService=executorService;
   }
   
    @Override
    public void run() {
                
      /*  partition obj=new partition(arr,lo,hi,executorService);
       Future<Integer> partitonpoint=executorService.submit(obj);
       int p;
    try {
        p = partitonpoint.get();
    } catch (InterruptedException | ExecutionException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }*/
    partition obj = new partition(arr, lo, hi, executorService);
    Future<Integer> partitionPoint = executorService.submit(obj);
    int p;
    try {
        p = partitionPoint.get();
    } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
        return;
    }

       QuickSortAlgo leftpart=new QuickSortAlgo(arr, lo, p-1, executorService);
        QuickSortAlgo rightpart=new QuickSortAlgo(arr, p+1, hi, executorService);

       executorService.submit(leftpart);
       executorService.submit(rightpart);
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    
}
