package Multithreading;
import java.io.*;

public class TestSleepMethod3 
{
    public static void main(String argvs[])
    {
        try
        {
            for(int j=0; j<5; j++)
            {
                Thread.sleep(-100);
                System.out.println(j);
            }
        }
        catch(Exception expn){System.out.println(expn);}
    }   
}