package Notes.Quick_Sort_Multi;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class partition implements Callable<Integer> {
    
    int[] arr;
    int low;
    int high;
    ExecutorService executorService;
    partition(int[] arr,int low,int high,ExecutorService executorService)
    {
           this.arr=arr;
           this.low=low;
           this.high=high;
           this.executorService=executorService;
    } 
    @Override
    public Integer call() throws Exception {
           
        int pivot=arr[high];
        
        int i=low;
        int j=low;
        
        while(j<=high)
        {
            if(arr[j]>pivot)
            {
                j++;
            }
            else
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
        }
        for (int val : arr) {
            System.out.println(val);
        }
        
        return i-1;

    }
    
}
