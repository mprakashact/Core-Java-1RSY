package Arrays.AfterOOP;

public class Testarray5
{

  public static void main(String args[])
   {
    int arr[]={33,3,4,5};
    System.out.println("printing original array;");
    for(int i:arr)
    System.out.println(i);

    System.out.println("printing lone of the array:");
    int carr[]=arr.clone();
    for(int i:carr)
    System.out.println(i);

    System.out.println("Are both qual?");
    System.out.println(arr==carr);
   }
}