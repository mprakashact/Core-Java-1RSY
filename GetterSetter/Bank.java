package GetterSetter;

public class Bank
 {

    private int minimumBalance = 2500;

    public int getMinimumBalance() 
    {
        return this.minimumBalance;
    }

    public void setMinimumBalance(int value) 
    {
        if(value>2500){
            this.minimumBalance = value;
            System.out.println("Your Sucssefully set for minimum balance in above 2500: " + minimumBalance);
        }else{
            System.out.println("Does not set for minimum balnce in under 2500 so set above or equal to 2500");
        }
        
    }
}
