package Notes.ProducerConsumermutex;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Main {

    public static void main(String[] ar)
    {
          Queue<Object> queue=new ConcurrentLinkedQueue<>();
          int maxSize=6;
          
          Lock lock=new ReentrantLock();
          Producer p1=new Producer(maxSize,queue,"P1",lock);
          Thread thread1=new Thread(p1);
          thread1.start();

          Producer p2=new Producer(maxSize,queue,"P2",lock);
          Thread thread2=new Thread(p2);
          thread2.start();

          Producer p3=new Producer(maxSize,queue,"P3",lock);
          Thread thread3=new Thread(p3);
          thread3.start();

          Producer p4=new Producer(maxSize,queue,"P4",lock);
          Thread thread4=new Thread(p4);
          thread4.start();

          Producer p5=new Producer(maxSize,queue,"P5",lock);
          Thread thread5=new Thread(p5);
          thread5.start();

          Producer p6=new Producer(maxSize,queue,"P6",lock);
          Thread thread6=new Thread(p6);
          thread6.start();

          Consumer c1=new Consumer(maxSize, queue,"C1",lock);
          Thread thread7=new Thread(c1);
          thread7.start();

          Consumer c2=new Consumer(maxSize, queue,"C2",lock);
          Thread thread8=new Thread(c2);
          thread8.start();

          Consumer c3=new Consumer(maxSize, queue,"C3",lock);
          Thread thread9=new Thread(c3);
          thread9.start();

          Consumer c4=new Consumer(maxSize, queue,"C4",lock);
          Thread thread10=new Thread(c4);
          thread10.start();

    }
    
}
