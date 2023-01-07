package JavaObjectClass.Constructor;

public class Student4 
{
    public static void main (String[] args)
    {
        Student4 s1 = new Student4(101, "RajaRaja Chozhan");
        Student4 s2 = new Student4(102, "Rajendra Chozhan");

        s1.display();
        s2.display();
    }
    
    
    
    int id;
    String name;

    Student4(int i, String n) 
    {
        id = i;
        name = n;
    }

    void display() 
    {
        System.out.println(id + " " + name);
    }
}
