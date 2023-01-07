package Encapsulation.encapsulation;

public class Student {

    private String college="AKG";

    //getter method
    public String getCollege(){return college;}


    public static void main(String[] args)
    {
        Student s=new Student();
        System.out.println(s.getCollege());

        // s.setCollege("RVS");
        // System.out.println(s.getCollege());


    }


//     public void setCollege(String college) {
//         this.college = college;
//     }
}