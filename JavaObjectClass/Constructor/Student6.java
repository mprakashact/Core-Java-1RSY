package JavaObjectClass.Constructor;

public class Student6 {

    int id;
    String name;

    Student6(int i, String n) {
        id=i;
        name=n;
    }

    // Student6(Student6 s){
    //     id=s.id;
    //     name=s.name;
    // }

    Student6(){}

    void display(){
        System.out.println(id+ " "+name);
    }

    




    public static void main(String[] args) {
        Student6 s1=new Student6(111, "Karan");
        Student6 s2=new Student6();

        s2.id=s1.id;
        s2.name=s1.name;

        s1.display();
        s2.display();
    }

}
