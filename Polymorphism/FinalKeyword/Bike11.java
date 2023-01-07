package Polymorphism.FinalKeyword;

public class Bike11 {
    int cube(/*final*/ int n){
        n=n+2;
        return n*n*n;
    }


    public static void main(String[] args){
        Bike11 b=new Bike11();
        System.out.println(b.cube(10));
    }  
}
