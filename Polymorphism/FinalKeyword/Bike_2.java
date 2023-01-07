package Polymorphism.FinalKeyword;

public class Bike_2 {
    final void run(){
        System.out.println("running...");
    }
}



class Honda2 extends Bike_2{
    public static void main(String[] args){
        new Honda2().run();
    }

}
