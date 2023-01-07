package Arrays.Youtube;

import java.util.Scanner;


public class ArrayBasics
{
    /*----------------------------------------------------------*/
    public static void main(String[] args) 
    {
        //*Array Declaration:-
        // int[] sslc={80,85,90,98,95};
        // for(int i=0; i<sslc.length; i++){System.out.println(sslc[i]);}



        // Scanner sc=new Scanner(System.in);
        
        // System.out.println("Enter array length: "); 
        // int count=sc.nextInt();

        // int[] total=new int[count];

        // int i=0;
        // while(i<count)
        // {
        //     System.out.println("Enter number: "); 
        //     total[i]=sc.nextInt();
        //     i++;
        // }

        // for(i=0; i<count; i++){ System.out.println("Total is: "+ total [i]);}



        // byte[] by=new byte[2];
        // short[] sh=new short[2];
        // int[] in=new int[2];
        // long[] lo=new long[2];
        // float[] fl=new float[2];
        // double[] d=new double[ 2];
        // char[] ch=new char[2];
        // boolean[] bo=new boolean[2];

        // int i=0;
        // for(i=0; i<by.length; i++){System.out.println("Byte array: "+by[i]);}
        // for(i=0; i<sh.length; i++){System.out.println("Short array: "+sh[i]);}
        // for(i=0; i<in.length; i++){System.out.println("Integer array: "+in[i]);}
        // for(i=0; i<lo.length; i++){System.out.println("Long array: "+lo[i]);}
        // for(i=0; i<fl.length; i++){System.out.println("Float array: "+fl[i]);}
        // for(i=0; i<d.length; i++){System.out.println("Double array: "+d[i]);}
        // for(i=0; i<ch.length; i++){System.out.println("Character array: "+ch[i]);}
        // for(i=0; i<bo.length; i++){System.out.println("Boolean array: "+bo[i]);}



    //     System.out.println("Byte array: "+by);
    //     System.out.println("Short array: "+sh); 
    //     System.out.println("Int array: "+in); 
    //     System.out.println("Long array: "+lo);
    //     System.out.println("Float array: "+fl); 
    //     System.out.println("Double array: "+d); 
    //     System.out.println("Char array: "+ch); 
    //     System.out.println("Boolean array: "+bo); 
    // }
      

//---------------------------------------------------------------
      //*Dimensional array:-
      //2D
    //   int[][] marks=new int[4][6];

    //   int[] sslc={65,76,98,43,52};
    //   int count=0;
    //   for(int i=0; i<sslc.length; i++)
    //     {
    //       if(sslc[i]>=60)
    //       count++;
    //     }
    //     System.out.println("No of centums in "+ count);
    //----------------------------------------------------------------

    //maximum og given array:-
        int[] mark={65,73,96,89,43};
        int max=0;
        int i=0;
        while(i<mark.length)
         {
            if(mark[i]>max)
            max=mark[i];
            i++;
         }
         System.out.println(max);
    //--------------------------------------------------------------------

/*--------------------------------------------------------------------------*/
    }
}        