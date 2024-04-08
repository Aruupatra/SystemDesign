import printoneto100;

package Notes.thread_test2;
public class mainoneto100
{
    public static void main(String ar[])
    {
        for(int i=1;i<=100;i++)
        {
            printoneto100 obj=new printoneto100(i);
            Thread thread=new Thread(obj);
            thread.start();

        }
    }
}