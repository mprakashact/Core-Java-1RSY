package Polymorphism.RuntimePolymorphism;

class Parent{void show(){System.out.println("parent");}}

class Child extends Parent{void show(){System.out.println("Child");}}


public class MethodOverridee {
    public static void main (String[] args){
        // Parent p;
        // p=new Parent();
        // p=new Child();
     Child c=new Child();
     c.show();
    // p.show();
    }
}