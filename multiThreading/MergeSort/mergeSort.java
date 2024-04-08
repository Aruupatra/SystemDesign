package Notes.MergeSort;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class mergeSort implements Callable<List<Integer>>
{

     List<Integer> listtoSort;
     ExecutorService executorService;

     mergeSort(List<Integer> listtoSort,ExecutorService executorService)
     {
        this.listtoSort=listtoSort;
        this.executorService=executorService;
     }

     public List<Integer> call() throws Exception
     {
        System.out.println("Sorted by thread : " + Thread.currentThread().getName());
        int size=listtoSort.size();

        if(size<=1)
        {
            return listtoSort;
        }
        List<Integer> leftHalf=new ArrayList<>();
        List<Integer> rightHalf=new ArrayList<>();

        for(int i=0;i<size/2;i++)
        {
            leftHalf.add(listtoSort.get(i));
        }

        for(int i=size/2;i<size;i++)
        {
            rightHalf.add(listtoSort.get(i));
        }

        mergeSort leftMergeSorter=new mergeSort(leftHalf, executorService);
        mergeSort rightMergeSorter=new mergeSort(rightHalf, executorService);
        //both are independent ,so here we are using multithreading 
        Future<List<Integer>> sortedFirstHalfFuture=executorService.submit(leftMergeSorter);
        Future<List<Integer>> sortedSecondHalfFuture=executorService.submit(rightMergeSorter);
  
        //blocker
        List<Integer> sortedFirstHalf=sortedFirstHalfFuture.get();
        List<Integer> sortedSecondHalf=sortedSecondHalfFuture.get();

        int i=0;
        int j=0;
        List<Integer> sortedList=new ArrayList<>();

        while(i<sortedFirstHalf.size() && j<sortedSecondHalf.size())
        {
            if(sortedFirstHalf.get(i)<sortedSecondHalf.get(j))
            {
               sortedList.add(sortedFirstHalf.get(i));
                i++;
            }
            else{
              
                sortedList.add(sortedSecondHalf.get(j));
                j++;
            }
        }

        while(i<sortedFirstHalf.size())
        {
           sortedList.add(sortedFirstHalf.get(i));
            i++;
        }

        while(j<sortedSecondHalf.size())
        {
            
           sortedList.add(sortedSecondHalf.get(j));
            j++;
        }

        return sortedList;

     }

    
}