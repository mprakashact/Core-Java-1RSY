package JavaObjectClass.Constructor;

public class ConstructorEx {
    int test;

    // No argument Constructor
    public ConstructorEx() {
        this.test = 0;
    }

    // Parametrized Constructor
    public ConstructorEx(int t) {
        this.test = t;
    }

    public static void main(String[] args) {

        ConstructorEx obj1 = new ConstructorEx();
        ConstructorEx obj2 = new ConstructorEx(10);
        int m = obj1.test;
        int m2 = obj2.test;
        System.out.println("obj1: " + m);
        System.out.println("obj2: " + m2);

    }
}
