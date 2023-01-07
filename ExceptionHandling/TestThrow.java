public class TestThrow 
{
    public static int divideNum(int m, int n) throws  ArithmeticException 
    {
    int div =m/n;
    return div;
    }  

    // public static void checkNum(int num)
    // {
    //     if(num<1){throw new ArithmeticException("\n NUmber in negative, cannot calculate squre");}
    //     else{System.out.println("Squre of" + num+"is"+(num*num));}
    // }

    public static void main(String[] args) 
    {
    //     TestThrow obj=new TestThrow();
    //     obj.checkNum(-3);
    //     System.out.println("Rest of the code..");  
    //   

    TestThrow obj=new TestThrow();
    try{ System.out.println(obj.divideNum(45,0));}
    catch(ArithmeticException e){ System.out.println("\nNumber cannot be divided by 0");  }

    System.out.println("Rest of the code..");  
    }
}