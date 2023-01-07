package String;

import java.io.PrintStream;

class Testimmutablestring
{
    public static void main(String args[])
    {
        String s="Sachin";
        s=s.concat("Tendulkar");
        PrintStream out = System.out;
        out.println(s);
    }

    public Testimmutablestring() {
    }
}