package Abstraction.WorkerScenario;

public class JavaDeveloper extends Worker {




    public static void main(String[] args)
    {
        JavaDeveloper sw=new JavaDeveloper();
        sw.work();
        sw.getLeaves();
        sw.getHike();
        System.out.println("-------------------------------");
        // JavaDeveloper swt=new Worker();
        // swt.getLeaves();
        // swt.getHike();
    }




public void work(){System.out.println("Project Using Java");}

public void getLeaves(){System.out.println("12 days Leaves");}

}