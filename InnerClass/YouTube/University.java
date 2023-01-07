package InnerClass.YouTube;

public class University 
{
    public static void main(String[] args)
    {
        College principle=new College();
        principle.meetingHODs();
        College.Dept hod=principle.new Dept();
        hod.conductFunction();
    }
}