package JavaObjectClass.StaticKeyword;

public class Student 
{
    int rollno;
    String name;
    static String College = "ITS";

    Student(int r, String n) 
    {
        rollno = r;
        name = n;
    }

    void display() 
    {
        System.out.println(rollno + " " + name + " " + College);
    }



    public class TestStaticVariable1 
    {
        public static void main(String[] args) 
        {
            Student s1 = new Student(111, "Karan");
            Student s2 = new Student(222, "Aryan");
            // Student.College="BITS";

            s1.display();
            s2.display();
        }
        
    }

}
