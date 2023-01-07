package Abstract;

public class Myclass extends Demo1 
{
    void display() 
    {
        System.out.println("Abstract method?");
    }

    public static void main(String[] args) 
    {
        Demo1 obj = new Myclass();
        obj.display();
    }

}