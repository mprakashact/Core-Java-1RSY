package Collections;
import java.util.Arrays;

public class ArrayLearningDemo 
{
    public static void main(String[] args) 
    {
        int arr[]={5,3,10,18,92};
        for(int i:arr)
         System.out.println(i);

         Arrays.sort(arr);
         System.out.println("After sorting");

         for(int i:arr)
         System.out.println(i);
    }
}