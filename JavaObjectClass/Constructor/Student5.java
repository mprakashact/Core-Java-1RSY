package JavaObjectClass.Constructor;

public class Student5 {

    public static void main(String[] args) {
        Student5 obj1 = new Student5(10, "Raju");
        Student5 obj2 = new Student5(20, "Radha", 13);

        obj1.display();
        obj2.display();
    }

    int id;
    String name;
    int age;

    // creating 2 Arguments
    Student5(int i, String n) {
        id = i;
        name = n;
        System.out.println("-------------------------------");
    }

    // Creating 3 Arguments
    Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }


}
