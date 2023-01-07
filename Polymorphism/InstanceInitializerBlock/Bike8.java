package Polymorphism.InstanceInitializerBlock;

public class Bike8 {

    Bike8(){System.out.println("constructor is invocked");}

    {System.out.println("instance initializer block invoked");}


    public static void main(String[] args){
        Bike8 b1=new Bike8();
        Bike8 b2=new Bike8();
    }
}
    