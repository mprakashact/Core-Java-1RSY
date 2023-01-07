package InnerClass.YouTube;

public class College 
/*#--------------------------------------CS---------------------------------------#*/
{
    static String principleName="ABCD";
    boolean uniform=false;
    int fee=30000;
    int fine=1;

/*---------------------------------------MS----------------------------------------*/
  public static void main(String[] args)
    {
        // College principle=new College();
        // // College.Dept hod=principle.new Dept();
        // // hod.conductFunction();
        // principle.meetingHODs();
        College principle=new College();
        principle.creatingDepts();
        // College.creatingDepts();
    }
/*---------------------------------------ME----------------------------------------*/

public /*static*/ void creatingDepts()
    {
        int deptfee=100;
        System.out.println("Setting Teams or Departments");
        class Dept
        {
            public void inaugurate(int amount)
            {
                System.out.println("Dept started");
                System.out.println(fee);
                System.out.println(principleName);
                System.out.println(deptfee);
            }
        }
        Dept hod=new Dept();
        hod.inaugurate(1000);
    }
    

    // class Dept
    // {
    //     int fine=2;
    //     boolean uniform=true;
    //     public void conductFunction()
    //     {
    //         int fine=1000;
    //         // College c=new College();
    //         // System.out.println(c.uniform);
    //         System.out.println(fine);
    //         System.out.println(this.fine);
    //         System.out.println(College.this.fine);
    //         System.out.println(College.this.uniform);
    //         System.out.println(fee);
    //         System.out.println(principleName);
    //         System.out.println(uniform);
    //         System.out.println("ECC Dept. Function");
    //     }
    // }
   
    // public void meetingHODs()
    // {
    //     // Dept hod=new Dept();
    //     // hod.conductFunction();
    // }
/*#--------------------------------------CE---------------------------------------#*/
}