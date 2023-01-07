package Abstraction.ShapeScenario;

public abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape{
    void draw(){System.out.println("drawing Rectangle");}
}

class Circle1 extends Shape{
    void draw(){System.out.println("drawing circle");}
}
