package Notes.Thread_test;
public class Client
{

    public static void main(String[] ar)
    {
      
       System.out.println("I am the main class");
       Adder adderobj=new Adder();
       Subtractor subobj=new Subtractor();


       Thread thread1=new Thread(adderobj);
       Thread thread2=new Thread(subobj);

       thread1.start();
       thread2.start();
       
    }
}