package Polymorphism.MethodOverloading;

public class OverloadingCalculation3 {
    void sum(int a, long b){
        System.out.println("a method invoked");
    }
// Error Occurd because two arguments in same data types (int & long), (long & int)
    // void sum(long a, int b){
    //     System.out.println("b method invoked");
    // }


    public static void main(String args[]){
        OverloadingCalculation3 obj=new OverloadingCalculation3();

        obj.sum(20, 20);
    }
    
}
