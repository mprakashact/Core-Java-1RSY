package Abstraction.AScenario;

public class Test5 {
    public static void main(String[] args){
        //Error Occur you try object create foe interface:
        // A a=new A();
        A a=new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }   
}