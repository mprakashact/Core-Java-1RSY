package JavaObjectClass.ThisKeyword;

public class A {

    void m() {
        System.out.println("Hello m");
    }

    void n() {
        System.out.println("Hello n");
        // m(); same as Defaultly this.m()
        this.m();
    }

    class TestThis4 {
        public static void main(String[] args) {
            A a = new A();
            a.n();
        }
    }

}
