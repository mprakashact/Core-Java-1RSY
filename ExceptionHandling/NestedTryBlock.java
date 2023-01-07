public class NestedTryBlock 
{
// /*---------------------------------------------------------------------------------*/
    public static void main(String args[])
    {
//         try
//         {
//           try{System.out.println("going to divide by 0"); int b=39/0;}
//           catch(ArithmeticException e){System.out.println(e);}

//           try{int a[]=new int[5]; a[5]=4;}
//           catch(ArrayIndexOutOfBoundsException e) {System.out.println(e);}
//           System.out.println("other statement");
//         }

//         catch(Exception e) {System.out.println("handled the exception (outer catch");}

//         System.out.println("normal flow..");
    /**-----------------------------------------------------------------------**/
    try  
     {
      try  
        {
         try  
         {int arr[]={1,2,3,4}; System.out.println(arr[10]);}
         catch(ArithmeticException e)
         {System.out.println("Arithmetic exception"); System.out.println("inner try block 2");}
        }
      catch(ArithmeticException e)
      {System.out.println("Arithmetic exception"); System.out.println("inner try block 1");}}

    catch(ArrayIndexOutOfBoundsException e4)
    {System.out.println(e4); System.out.println("outer (main) try block");}
    catch (Exception e5){System.out.println("Exception"); System.out.println("handled in main try-block");}
    /**-----------------------------------------------------------------------**/
    /**-----------------------------------------------------------------------**/
    /**-----------------------------------------------------------------------**/
    /**-----------------------------------------------------------------------**/
    } 
/*---------------------------------------------------------------------------------*/
}