package Notes.MergeSort;
/*import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;*/
//package org.example.MultiThreadingMergeSorting;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.*;

public class mergeSortmain {
    public static void main(String ar[]) throws InterruptedException, ExecutionException
    {
       // List<Integer> listtoSort=List.of(1,5,4,3,2,8,7,6);
       List<Integer> listtoSort = Arrays.asList(1, 5, 4, 3, 2, 8, 7, 6);
        ExecutorService executorService=Executors.newCachedThreadPool();

        mergeSort megersort=new mergeSort(listtoSort,executorService);

        Future<List<Integer>> futureList=executorService.submit(megersort);

        List<Integer> sortedList=futureList.get();

        System.out.println(sortedList);

        
    }
    
}
