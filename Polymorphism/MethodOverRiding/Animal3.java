package Polymorphism.MethodOverRiding;


// Runtime polymorphism exaple put in methodoverloading

public class Animal3 {
    void eat(){System.out.println("animal is eating...");}
}

class Dog extends Animal3{
    void eat(){System.out.println("dog is eating...");}    
}

class BabyDog1 extends Dog{
    public static void main(String[] args){
        Animal3 a=new BabyDog1();
        a.eat();
    }}