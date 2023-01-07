package InnerClass.YouTube;

public class Person 
{
    public static void main(String[] args)
    {
        Mobile m1=new Mobile();
        m1.call();
        Mobile smartphone=new Mobile()
               {
                public void call()
                {System.out.println("Video Call, Global Call, Group Call");}
               };    
               smartphone.call();    
    }
}