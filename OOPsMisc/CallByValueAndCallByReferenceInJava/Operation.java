package OOPsMisc.CallByValueAndCallByReferenceInJava;

public class Operation 
{
    int data=50;

    /**
     * JAVADOC TOOL USE
     * @param data
     * @author 2.o
     */
    void change(int data)
    {
        data=data+100;
        // System.out.println(data);
    }

    public static void main(String args[])
    {
        Operation op=new Operation();

        System.out.println("before change: "+op.data);

        op.change(500);
        System.out.println("after change "+op.data);
    }
    
}