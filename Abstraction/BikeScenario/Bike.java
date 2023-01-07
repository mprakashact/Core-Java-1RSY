package Abstraction.BikeScenario;

public abstract class Bike {
    Bike(){System.out.println("bieke is created");}
    
    abstract void run();
    
    void changeGear(){System.out.println("gear Changed");}
}