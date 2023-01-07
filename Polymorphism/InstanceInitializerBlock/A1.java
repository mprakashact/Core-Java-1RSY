package Polymorphism.InstanceInitializerBlock;

public class A1 {

    A1(){
        System.out.println("A1 parent class constructor invocked");
    }
}

class B3 extends A1{
    B3(){
        super();
        System.out.println("B3: child class constructor invoked");
    }

    B3(int a){
        super();
        System.out.println("Argument B3: child class constructor invoked "+a);
    }


    {System.out.println("instance initializer block is invocked");}



    public static void main(String[] args) {
        B3 b1=new B3();
        B3 b2=new B3(10);
    }
}
