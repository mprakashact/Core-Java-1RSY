package JavaObjectClass.StaticKeyword;

public class Student1 {

    int rollno;
    String name;
    static String college = "ITS";

    static void change() {
        college = "BBDIT";
    }

    Student1(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }



    public class TestStaticMethod {

        public static void main(String[] args) {
            // calling change method
           Student1.change();

           Student1 c1=new Student1(101, "Karan");
           Student1 c2=new Student1(102, "Vetri");
           Student1 c3=new Student1(103, "Maran");

           c1.display();
           c2.display();
           c3.display();
        }

    }

}
