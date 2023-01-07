package JavaObjectClass.StaticKeyword;

public class StaticBlock {

    public StaticBlock() {
        System.out.println("Hello from constructor Block");
    }

    {
        System.out.println("Hello from non static Block");
    }

    {
        System.out.println("Hello from non static Block 2");
    }

    static {
        System.out.println("Hello from static Block");
    }

    static {
        System.out.println("Hello from static Block 2");
    }

    public static void test() {
        System.out.println("Hello from test block");
    }

    public static void main(String[] args) {

        System.out.println("Hello from Main Method");
        StaticBlock s1 = new StaticBlock();
        // StaticBlock s2=new StaticBlock();
        // StaticBlock s3=new StaticBlock();
        StaticBlock s4=new StaticBlock();
        s4.test();
        StaticBlock.test();

    }
}