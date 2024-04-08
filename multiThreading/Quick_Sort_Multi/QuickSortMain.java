package Notes.Quick_Sort_Multi;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class QuickSortMain {

        public static void main(String ar[])
    {
        int[] arr={2,1,5,4,7,9,8,10,3,9};
         
        ExecutorService executorservice=Executors.newCachedThreadPool();
        
       
       QuickSortAlgo obj=new QuickSortAlgo(arr,0,arr.length-1,executorservice);
        executorservice.submit(obj);
        // Shut down the executor and wait for termination
        executorservice.shutdown();
        try {
            executorservice.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the sorted array after waiting for completion
        for (int val : arr) {
            System.out.println(val);
        }
      

    }
    
}
