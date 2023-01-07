package Polymorphism.RuntimePolymorphism.ShapeScenario;

public class Shape {
    void draw() {
        System.out.println("drawing...");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing Rectangle...");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing Circle...");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("drawing Triangle...");
    }
}