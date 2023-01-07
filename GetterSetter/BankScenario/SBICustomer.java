package GetterSetter.BankScenario;

public class SBICustomer {

    public static void main(String[] args){

        StateBank sbi=new StateBank();
        int minimum=sbi.getMinBalance();
        System.out.println(minimum);

        int emi=sbi.getEMI();
        System.out.println(emi);

        sbi.setEMI(200);
        emi=sbi.getEMI();
        System.out.println(emi);

    }
}