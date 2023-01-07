package Polymorphism.FinalKeyword;

public class Bike {
    final void run(){
        System.out.println("running");
    }
}

// If you make any method as final, you cannot override it.

class Honda extends Bike{
    // void run(){
    //     System.out.println("running safely with 100kmph");
    // }


    public static void main(String[] args){
        System.out.println("---------main method start------------");
        // Honda honda=new Honda();
        // honda.run();
    }
}
