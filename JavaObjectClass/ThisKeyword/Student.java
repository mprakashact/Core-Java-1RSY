package JavaObjectClass.ThisKeyword;

public class Student 
{
    int rollno;
    String name;
    float fee;

    Student(int rollno, String name, float fee)
    // Student(int r, String n, float f)
    {

        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
        // rollno=r;
        // name=n;
        // fee=f;
    }

    void display()
    {
        System.out.println(rollno+" "+name+" "+fee);
    }


    class TestThis1{
        public static void main(String[] args){
            Student s1=new Student(101, "Raju", 1000f);
            Student s2=new Student(102, "Rani", 2000f);

            s1.display();
            s2.display();
        }

    }
}