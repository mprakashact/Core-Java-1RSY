package Encapsulation.AccessModifiers.Override;

public class Simple extends A
    {  
        void msg(){System.out.println("Hello java");} //C.T.Error       
        public static void main(String args[])
         {  
           Simple obj=new Simple();  
           obj.msg();  
         }  
        
    }