import java.util.Scanner;

public class EvenOdd 
{
    
    public static void main(String[] args) 
    {
        // creating a Scanner Class Object
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the Number: ");
    
        // Reading the value from the user
        int num=s1.nextInt();
        
        // method calling
        findEvenOdd(num);
    }


    public static void findEvenOdd(int num)
    {
        // method body
        if(num%2==0){
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }

}
