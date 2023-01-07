package Abstraction.Interface.EmployeeScenario;

public class NigeriaEmployee implements EmployeeRulesNigeria{

    public static void main(String[] args){

        NigeriaEmployee ne=new NigeriaEmployee();
        System.out.println(ne.SALARY);


    }
   
    public void dress(){}
    public void giveSalary(){}

    public void maintainHours(){}
    public void relocate(){}
    
}