package Polymorphism.InstanceOf;

public class Animal {

    // void R(){System.out.println("Super Class");}
  
}
class Dog1 extends Animal{
    public static void main(String[] args){
        Dog1 d=new Dog1();

        System.out.println(d instanceof Animal);
        System.out.println(d instanceof Dog1);

        // d.R();

    }
}
