package YouTube;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 
{
/*---------------------------------------MS----------------------------------------*/
    public static void main(String[] args)
    {
    /**-----------------------------------------------------------------**/
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the Number 1: ");
        // int no1=sc.nextInt();
        // System.out.println("Enter the Number 2: ");
        // int no2=sc.nextInt();

        // int result=no1/no2;
        // System.out.println("Number1/Number2 is: "+result);
    /**-----------------------------------------------------------------**/
    ExceptionDemo1 ed=new ExceptionDemo1();
    ed.divide();
    // ed.add();
    /**-----------------------------------------------------------------**/
    }
/*---------------------------------------ME----------------------------------------*/

    private void add() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number 1: ");
        int no1=sc.nextInt();
        System.out.println("Enter the Number 2: ");
        int no2=sc.nextInt();

        int result=no1+no2;
        System.out.println("Number1+Number2 is: "+result);
    }

    private void divide() 
    {
        Scanner sc=new Scanner(System.in);
        
        try
         {
            System.out.println("Enter the Number 1: "); //InputMismatchException
            int no1=sc.nextInt();
            System.out.println("Enter the Number 2: ");
            int no2=sc.nextInt();
       
            int result=no1/no2;   //ArithmeticException
            System.out.println("Number1/Number2 is: "+result);
         }
        //  catch(Exception e)
        //  {System.out.println("Unknow reasons");  divid2e();}
        // catch(ArithmeticException ae)
        //  {System.err.println("no2 is Zero. Please Check Number 2 Value"); divide();}
        // catch(InputMismatchException ime)
        //  {System.out.println("Please Enter Only Numbers");  divide();}
        catch(Exception e)
         {System.err.println("Unknow reasons");  divide();}

        // finally{System.out.println("finally Block");}
         
        // add();
    }
}