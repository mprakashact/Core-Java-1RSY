package Multithreading.YouTube;

public class ThreadCaller 
{
    public static void main(String[] args) throws InterruptedException
    {
        ChildThread ct=new ChildThread();
        ct.start();
        
        ct.interrupt();
        for(int i=0; i<=5; i++)
        {
            // ct.interrupt(); 
            System.out.println("Main Thread "+i);
        }

        // ct.yield();
    /**-----------------------------------------------------------------**/
        // ChildThread ct=new ChildThread();
        // System.out.println(ct.getState());
        // // ct.setPriority(9);
        // System.out.println(ct.getName());

        // ct.setName("Customer");
        // System.out.println(ct.getName());

        // System.out.println(ct.getId());
        
        // System.out.println(ct.getPriority());
        // // ct.start(); //new thread start

        
       
        // // // System.out.println(ct.getState());
        
       
        // // // ct.start();

        // // AbcChild ac=new AbcChild();
        // // ac.start();

        // // for(int i=1; i<=5; i++)
        // // {System.out.println("Main Thread "+i);}
        // // System.out.println(ct.getState());
    /**-----------------------------------------------------------------**/
    }
}