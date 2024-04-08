package Notes.ProducerConsumerSemaphore;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Main {

    public static void main(String[] ar)
    {

        Queue<Object> queue=new ConcurrentLinkedQueue<>();
        int maxSize=6;

         Semaphore producer=new Semaphore(6);
         Semaphore consumer=new Semaphore(0);

         Producer p1=new Producer(maxSize, queue,"P1",producer,consumer);
         Thread t1=new Thread(p1);
         t1.start();
         
         Producer p2=new Producer(maxSize,queue,"P2",producer,consumer);
         Thread thread2=new Thread(p2);
         thread2.start();

         Producer p3=new Producer(maxSize,queue,"P3",producer,consumer);
         Thread thread3=new Thread(p3);
         thread3.start();

         Producer p4=new Producer(maxSize,queue,"P4",producer,consumer);
         Thread thread4=new Thread(p4);
         thread4.start();

         Producer p5=new Producer(maxSize,queue,"P5",producer,consumer);
         Thread thread5=new Thread(p5);
         thread5.start();

         Producer p6=new Producer(maxSize,queue,"P6",producer,consumer);
         Thread thread6=new Thread(p6);
         thread6.start();

         Consumer c1=new Consumer(maxSize, queue,"C1",producer,consumer);
         Thread thread7=new Thread(c1);
         thread7.start();

         Consumer c2=new Consumer(maxSize, queue,"C2",producer,consumer);
         Thread thread8=new Thread(c2);
         thread8.start();

         Consumer c3=new Consumer(maxSize, queue,"C3",producer,consumer);
         Thread thread9=new Thread(c3);
         thread9.start();

         Consumer c4=new Consumer(maxSize, queue,"C4",producer,consumer);
         Thread thread10=new Thread(c4);
         thread10.start();
    }
    
}