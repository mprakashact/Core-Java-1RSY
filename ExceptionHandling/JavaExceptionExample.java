import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class JavaExceptionExample 
{
/*--------------------------------------------------------------------------------*/
    public static void main(String[] args)
    {
    /**-----------------------------------------------------------------------**/
        // try {int data=100/0;} 
        // catch (ArithmeticException e) {System.out.println(e);}
        /*TODO: handle exception*/ 
        // System.out.println("rest of the code");
    /**-----------------------------------------------------------------------**/
    // String s=null;
    // System.out.println(s.length()); //NullPointerException
    /**-----------------------------------------------------------------------**/
    // String s="abc";
    // int i=Integer.parseInt(s); //NumberFormatException
    /**-----------------------------------------------------------------------**/
    // int a[]=new int[5];
    // a[10]=50; //ArrayIndexOutOfBoundsException
    /**--------------------------------TryCatch-----------------------------------**/
    // try{int data=50/0; System.out.println("rest of the code");}
    // catch(ArithmeticException e){System.out.println(e);}

    // try{int data=50/0;}
    // catch(Exception e){ System.out.println("Can't divided by zero");/*System.out.println(e);*/}
    // System.out.println("rest of the code");

    // int i=50;
    // int j=0;
    // int data;
    // try{data=i/j;}
    // catch(Exception e){System.out.println(i/(j+2));}
    // }   

    // try{int data1=50/0;}
    // catch(Exception e){int data2=50/0;}
    // System.out.println("rest of the code");

//     try{int data =50/0;}
//     catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
//     System.out.println("rest of the code");

// try {int arr[]={1,3,5,7}; System.out.println(arr[10]);}
// catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
// System.out.println("rest of the code");

PrintWriter pw;
try{pw=new PrintWriter("jtp.txt"); pw.println("saved");}
catch(FileNotFoundException e){System.out.println(e);}
System.out.println("File saved successfully");
}
/*--------------------------------------------------------------------------------*/
}