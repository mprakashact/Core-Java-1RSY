package Polymorphism.FinalKeyword;

import inheritance.MultipleInheritance.B;

public class Bike10 {
    final int speedlimit;

    Bike10(){
        speedlimit=70;
        System.out.println(speedlimit);
    }


    public static void main(String[] args){
        new Bike10();
    }
    
}
