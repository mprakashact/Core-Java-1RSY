package OOPsMisc.WrapperClass;

public class WrapperExample1 
{

    public static void main(String[] args) 
    {
        //Converting int into Integer
        int a=20;
        Integer i=Integer.valueOf(a); //converting int into Integer explicitly
        
        Integer j=a;

        System.out.println(a+" "+i+" "+j);

//Deprecated It is rarely appropriate to use this constructor. The static factory valueOf(int) is generally a better choice, as it is likely to yield significantly better space and time performance.

// Constructs a newly allocated Integer object that represents the specified int value.

// Parameters:

// value the value to be represented by the Integer object.
// The constructor Integer(int) has been deprecated since version 9 and marked for removalJava(67110276)
    }

}