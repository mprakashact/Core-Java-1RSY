package Polymorphism.RuntimePolymorphism;

// Error: Could not find or load main class Polymorphism.RuntimePolymorphism.Splendor
// Caused by: java.lang.ClassNotFoundException: Polymorphism.RuntimePolymorphism.Splendor

public class Bike {
    void run() {
        System.out.println("running");
    }
}

class Splendor extends Bike {
    void run() {
        System.out.println("running safely with 60km");
    }

    public static void main(String[] args) {
        Bike b = new Splendor();
        b.run();
    }
}




