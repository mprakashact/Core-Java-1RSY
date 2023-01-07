package SamplePrograms;

public class Fibonacciseries 
{
    static int n1=0, n2=1, n3=0;
    static void printFibonacci(int count)
    {
        if(count>0)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;

            System.out.println(" "+n3);
            printFibonacci(count-1);
        }

    }
/*---------------------------------------MS----------------------------------------*/
public static void main(String[] args) 
    {
    /**-----------------------------------------------------------------**/
    //Without Recurssion
        // int n1=0, n2=1, n3, i, count=15;
        // System.out.print(n1+" "+n2);

        // for(i=2; i<count; ++i)
        // {
        //  n3 = n1+n2;
        //  System.out.print(" "+n3);
        //  n1=n2;
        //  n2=n3;
        // }
    /**-----------------------------------------------------------------**/
    //With Recurssion
    int count=10;
    System.out.println(n1+" "+n2);
    printFibonacci(count-2);
    }
/*---------------------------------------ME---------------------------------------*/  
}