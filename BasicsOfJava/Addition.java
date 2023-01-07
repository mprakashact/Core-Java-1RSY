public class Addition 
{

    public static void main (String[] args)
    {
        int a = 19;
        int b = 5;
    
        //method calling
        int c = add(a,b);  //a and b is actual parametres
        System.out.println("The sum of a and b is= " +c);
    }
    

    //User Defined Method
    public static int add(int n1, int n2) //n1, n2 is are formal parametres
    {
        int s;
        s = n1+n2;
        return s; //returning the sum
    }
}

