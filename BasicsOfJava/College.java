 
 class College {
    int a;
    String Name;

    class ClassA {
        public static void main (String args[]) {
            College Q1=new College();
            College Q2=new College();
            System.out.println(Q1.a + " " + Q1.Name);
            Q1.a=101;
            Q1.Name="Selvan";
            Q2.a=102;
            Q2.Name="Kumar";
            System.out.println(Q1.a + " " + Q1.Name);
            System.out.println(Q2.a + " " + Q2.Name);
        }
   
    }
}

 
 /* //Java Program to demonstrate having the main method in   
//another class  
//Creating Student class.  
class Student{  
    int id;  
    String name;  
   }  
   //Creating another class TestStudent1 which contains the main method  
   class TestStudent1{  
    public static void main(String args[]){  
     Student s1=new Student();  
     System.out.println(s1.id);  
     System.out.println(s1.name);  
    }  
   }  
 
  
/* 

public class ClassCreation {
    int a;
    String name;
    public static void main(String args[]){
        ClassCreation s1=new ClassCreation();
        s1.a=10;
        s1.name="Mr.X";

        System.out.println(s1.a + " " + s1.name);
        System.out.println(s1.name);
    }
}

//Java Program to illustrate how to define a class and fields  
//Defining a Student class.  
class Student{  
    //defining fields  
    int id;//field or data member or instance variable  
    String name;  
    //creating main method inside the Student class  
    public static void main(String args[]){  
     //Creating an object or instance  
     Student s1=new Student();//creating an object of Student  
     //Printing values of the object  
     System.out.println(s1.id);//accessing member through reference variable  
     System.out.println(s1.name);  
    }  
   } 
   */