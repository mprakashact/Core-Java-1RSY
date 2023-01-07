package Abstraction.Interface.EmployeeScenario;

public class ABCEmployee implements EmployeeRules, FamilyRules {



    public static void main(String[] args)
    {
        ABCEmployee abc=new ABCEmployee();
        abc.maintainHours();
        abc.relocate();
         
        // abc.SALARY=35000; // by default, these variables are final and static
        // abc.LEAVES=20;
        System.out.println(EmployeeRules.SALARY);
        System.out.println(EmployeeRules.LEAVES);

        FamilyRules father=new ABCEmployee(); // Dynamic Binding
        father.eatTogether();
        // father.report(); //error occur 
    }




    public void maintainHours(){} // by default, they are abstract
    public void relocate(){System.out.println("Other City");}
    public void report(){System.out.println();}
    public void dress(){System.out.println("Manager");}

    
    public void takeCareParents(){}
    public void eatTogether(){System.out.println("good 2");}
    public void enjoy(){}
    public void helpmembers(){}
}