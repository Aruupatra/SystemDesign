package Notes.Quick_Sort_Multi;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class QuickSort implements Runnable{
     int[] arr;
     ExecutorService executorService;
     QuickSort(int[] arr,ExecutorService executorService)
     {
        this.arr=arr;
        this.executorService=executorService;
     }
    @Override
    public void run() {

        QuickSortAlgo obj=new QuickSortAlgo(arr,0,arr.length-1,executorService);
        executorService.submit(obj);
       
    }


    
    
}
