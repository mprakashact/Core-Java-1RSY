package Polymorphism.FinalKeyword;

public /*final*/ class Bike_1 {

}

class Honda1 extends Bike_1{
    void run(){System.out.println("running safely with 100kmph");}


    public static void main (String[] args){
        Honda1 honda=new Honda1();
        honda.run();
    }
}




