package JavaObjectClass.ThisKeyword;

public class A2{

    A2(){
        this(255);
        System.out.println("Hello a");
    }

    A2(int x){
        System.out.println(x);
    }


    class TestThis5{
        public static void main (String[] args){
            A2 a=new A2(); 
                }
    }
    
}