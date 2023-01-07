package Abstraction.Interface.MultipleInheritance;

interface Printable{void print();}

interface Showable{void show();}



public class A7 implements Printable, Showable {
    public void print(){System.out.println("Hello I'am print");}
    public void show(){System.out.println("Hello I'am show");}
    public static void main(String[] args)
    {
      A7 obj=new A7();
      obj.print();
      obj.show();
    }
    
}