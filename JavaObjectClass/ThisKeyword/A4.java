package JavaObjectClass.ThisKeyword;

class A4 
    {
        int data=10;
        A4(){
            B b=new B(this);
            b.display();
        }
    



    public static void main (String[] args)
    {
        A4 a=new A4();
    }
}
