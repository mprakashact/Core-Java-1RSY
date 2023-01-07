package Abstraction.BankScenario;

public class TestBank {
    public static void main(String[] args){
        Bank b;

        b=new SBI();
        System.out.println("SBI Rate of interest is: "+b.getRateOfInterest()+ " %");

        b=new PNB();
        System.out.println("PNB Rate of interest is: "+b.getRateOfInterest()+ " %");
    }
}