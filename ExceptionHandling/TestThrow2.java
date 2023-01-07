import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrow2
{
/*-----------------------------------MS--------------------------------------------*/
    public static void main(String args[])
    {
        // try{System.out.println("Inside the try block"); int data =25/0; System.out.println(data);}
        // // catch(ArithmeticException e1){System.out.println(e1);}
        // catch(NullPointerException e){System.out.println(e);}

        // finally{System.out.println("finally block is always executed");}

        // System.out.println("rest of the code");
    /**---------------------------------------------------------------------------**/
    // validate(13);
    // System.out.println("rest of the code");
    /**---------------------------------------------------------------------------**/try{method();}
    catch(FileNotFoundException e){e.printStackTrace();}
    System.out.println("rest of the code..");
    }
/*-----------------------------------ME--------------------------------------------*/

        public static void method()  throws FileNotFoundException
        {
            FileReader file=new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
            BufferedReader fileInput=new BufferedReader(file);

            throw new FileNotFoundException();
        }
    /***-----------------------------------------------------------------------***/
    // public static void validate (int age) 
    // {
    //     if(age<18){throw new ArithmeticException("Person is not eligible to vote");}
    //     else{System.out.println("Person is eligible to Vote!!");}
    // }
    /***-----------------------------------------------------------------------***/
}