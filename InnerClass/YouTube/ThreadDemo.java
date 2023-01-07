package InnerClass.YouTube;

public class ThreadDemo 
{

    public static void main(String[] args)
    {
        // Thread t=new Thread()
        Runnable r=new Runnable()
        {
            public void run()
            {
                for(int i=1; i<=5; i++)
               {
                System.out.println(i);
               }
            }       
        };

        // t.start();
        // for(int i=1; i<=5; i++)
        //        {
        //         System.out.println("Main "+i);
        //        }

        Thread t=new Thread(r);
        t.start(); 
        for(int i=1; i<=5; i++)
               {
                System.out.println("Main "+i);
               }
    }

}