package Encapsulation.encapsulation.BankScenario;

public class TestEncapsulation {

    public static void main (String[] args)
    {
        Account acc=new Account();
        
        //setting value
        acc.setAcc_no(1213141516);
        acc.setName("Vivek");
        acc.setEmail("viveks@gmail.com");
        acc.setAmount(50000f);

        //getting value
        // System.out.println("Accont no: "+acc.getAcc_no()+" "+"Name: "+acc.getName()+" "+"Email ID:  "+" "+acc.getEmail()+" "+"Amount: "+acc.getAmount());
        System.out.println("Accont no: "+acc.getAcc_no());
        System.out.println("Name: "+acc.getName());
        System.out.println("Email ID:  "+acc.getEmail());
        System.out.println("Amount: "+acc.getAmount());
    }
}