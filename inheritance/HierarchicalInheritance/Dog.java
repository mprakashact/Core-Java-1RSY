package inheritance.HierarchicalInheritance;

class Dog extends Animal {
    void bark(){
        System.out.println("barking...");
    }
}


class TestInheritance4{
    public static void main(String[] args) {
        Dog d=new Dog();

        d.bark();
        d.eat();
    }
}