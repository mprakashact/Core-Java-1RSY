package Abstraction.WorkerScenario;

public abstract class Worker {
    
    
    
    public static void main(String[] args)
    {  
        // Worker w=new Worker();
        // w.getLeaves();
        // w.getHike();
        // w.work();
    }




    public abstract void work();

    public void getLeaves(){System.out.println("10 days Leaves");}

    public void getHike(){System.out.println("Annually");}

} 