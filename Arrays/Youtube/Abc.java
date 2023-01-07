package Arrays.Youtube;
import java.util.Scanner;

public class Abc 
{
/*-----------------------------MAIN START--------------------------------*/
   public static void main (String[] args) 
    {
       //---------------------------------------------------  
    //    int arr[]=new int[5]; 
    //    float arr[]=new float[5]; 
    //    boolean arr[]=new boolean[5]; 
    //    byte arr[]=new byte[5];
    //    short arr[]=new short[5];
    //    long arr[]=new long[5];  
    //    char arr[]=new char[5]; 
    //    String arr[]=new String[5]; 
    //    Abc arr[]=new Abc[5]; 
    
    //    Scanner sc=new Scanner (System.in);
    
    //    for(int i=0; i<5; i++)
    //     { 
    //         System.out.println("Enter value: ");
    //         arr[i]=sc.nextInt();
    //     }

        // int i=0;
        // while(i<5)
        // {
        //     System.out.print(arr[i]+ " ");
        //     i++;
        // }
        //---------------------------------------------------
        // Abc a=new Abc();
        // Abc b=new Abc();
        // Abc c=new Abc();
        
        // String name;
        // int ab;
        // String ar[]=new String[5];
        // System.out.println(ar.length);

        // int[] br=new int[5];

        // ar[0]="abc";
        // ar[1]="bcd";
        // ar[2]="cde";

        // int i=0;
        // while(i<ar.length){System.out.println(ar[i]); i++;}
       //---------------------------------------------------
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter length");
       int len=sc.nextInt();

       int[] ar=new int[len];
       int total=0;

       for(int i=0; i<ar.length; i++)
         {
            System.out.println("Enter value");
            ar[i]=sc.nextInt();
            total=total+ar[i];
         }
         System.out.println("Total is: "+total);

         int i=0;
         while(i<ar.length)
          {
            if(ar[i]%2==0)
             {
                System.out.println(ar[i]);
             } 
                i++;
          }

        //  System.out.println(ar);

        //  for(int i=0; i<ar.length; i++)
        //  {
        //     System.out.println(ar[i]);
        //  }
       //---------------------------------------------------
    }
/*----------------------------MAIN END-----------------------------------*/
} 