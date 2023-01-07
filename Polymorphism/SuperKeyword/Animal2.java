package Polymorphism.SuperKeyword;

public class Animal2 {
    String color="White"; 
}

class Dog extends Animal2{
    String color="black";

void printColor(){
    System.out.println(color);
    System.out.println(super.color);
}
}


class TestSuper1{
    public static void main (String[] args){
        Dog d=new Dog();

        d.printColor();
    }
}
