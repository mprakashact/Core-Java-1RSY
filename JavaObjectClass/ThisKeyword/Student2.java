package JavaObjectClass.ThisKeyword;

public class Student2 {
    int rollno;
    String name, course;
    float fee;

    Student2(int rollno, String name, String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }

    Student2(int rollno, String name, String course, float fee){
        // this.fee=fee;
        // don't call this.fee in first occur error
        this(rollno, name, course);
        this.fee=fee;
    }

    void display(){
        System.out.println(rollno+" "+name+" "+course+" "+fee);
    }
    

    class TestThis7{
        public static void main (String[] args){
            Student2 s1=new Student2(111, "ankit", "java");
            Student2 s2=new Student2(102, "Maran", "C++", 2000f);

            s1.display();
            s2.display();

        }
    }
}
