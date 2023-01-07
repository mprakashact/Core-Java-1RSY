import java.util.Scanner;





public class UserDefinedMethod {

    //User Defined Method
    public static void findEvenOdd(int num)
    {
         //Method body
         if(num%2==0){
            System.out.println(num + "  is Even");
         } else {
            System.out.println(num + "  is Odd");
         }
    }

    public static void main (String[] args)
     {
        UserDefinedMethod s1=new UserDefinedMethod();
        findEvenOdd(11);

    }
    
} 
