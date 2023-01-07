package String;

import java.util.StringTokenizer;

public class Simple 
{
/*--------------------------------------------------------------------------*/ 
    public static void main(String[] args) 
   {
        // StringTokenizer st=new StringTokenizer("my name is khan","  ");
        // while(st.hasMoreTokens())
        // {
        //     System.out.println(st.nextToken());
        // }

        // StringTokenizer st=new StringTokenizer("my,name,is,khan");
        // System.out.println("Next token is: "+st.nextToken(","));
    /**---------------------------------------------------------------------**/
    // StringTokenizer st=new StringTokenizer("Demonstrating methods from StringTokenizer class"," ");
    // while(st.hasMoreTokens()){System.out.println(st.nextToken());}

    // StringTokenizer st=new StringTokenizer("Hello everyone I am a Java developer"," ");
    // while(st.hasMoreElements()){System.out.println(st.nextToken());}

    // StringTokenizer st=new StringTokenizer("Hello Everyone Have a nice day"," ");
    // while(st.hasMoreTokens()){System.out.println(st.nextElement());}

    StringTokenizer st=new StringTokenizer("Hello Everyone Have a nice day"," ");
    System.out.println("Total number of Tolens: "+st.countTokens());
    /**---------------------------------------------------------------------**/
    }
/*--------------------------------------------------------------------------*/ 
}