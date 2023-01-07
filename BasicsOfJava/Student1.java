public class Student1 
{
    private int roll = 505;
    private String name = "Moorthi";

    //get&set in roll no
    public int getRoll() 
    {
        return roll;
    }
    public void setRoll(int roll) 
    {
        this.roll = roll;
    }

    //get&set in name
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
           this.name = name;
    }

    public void display()
    {
        System.out.println("Rool no: " + roll);
        System.out.println("Student Name: " + name);
    }

}