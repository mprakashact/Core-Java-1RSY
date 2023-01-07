package Multithreading.YouTube;

public class ChildThread extends Thread 
{
    public void run()
    {

      for(int i=1; i<=5; i++)
       {
        try 
          {
            Thread.sleep(2000);
            // Thread.yield(); 
            System.out.println("Child Thread "+i);
          }
        catch (InterruptedException e) 
          {
            System.out.println("My sleep got interrupted");
            // TODO Auto-generated catch block
            // e.printStackTrace();
          } 
       }
        
    }
}