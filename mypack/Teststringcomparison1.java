

public class Teststringcomparison1 
{
/*-----------------------------------------------------------------------*/
    public static void main(String args[])
    {  
    /*8-----------------------------------------------------------**/
    // String s1="Sachin";
    // String s2="Sachin";
    // String s3=new String("Sachin");
    // String s4="Saurav";

    // System.out.println(s1.equals(s2));
    // System.out.println(s1.equals(s3));
    // System.out.println(s1.equals(s4));
    /**-----------------------------------------------------------**/
    // String s1="Sachin";
    // String s2="SACHIN";
    // System.out.println(s1.equals(s2));
    // System.out.println(s1.equalsIgnoreCase(s2));
    /**-----------------------------------------------------------**/
    // String s1="Sachin";
    // String s2="Sachin";
    // String s3=new String("Sachin");
    // System.out.println(s1==s2);
    // System.out.println(s1==s3);
    /**-----------------------------------------------------------**/
    // String s1="Sachin";
    // String s2="Sachin";
    // String s3="Ratan";
    // System.out.println(s1.compareTo(s2)); //0
    // System.out.println(s1.compareTo(s3)); //1 (s1>s3)
    // System.out.println(s3.compareTo(s1)); //-1 (s3<s1)
    /**-----------------------------------------------------------**/
    // String s="Sachin"+" Tendulkar";
    // String s=50+30+"Sachin"+40+40;
    // System.out.println(s);

    // String s1="Sachin ";
    // String s2="Tendulkar";
    // String s3=s1.concat(s2);
    // System.out.println(s3);
    /**-----------------------------------------------------------**/
    // StringBuilder s1=new StringBuilder("Hello");
    // StringBuilder s2=new StringBuilder(" World");
    // StringBuilder s=s1.append(s2);
    // System.out.println(s.toString());
    /**-----------------------------------------------------------**/
    // String s1=new String("Hello");
    // String s2=new String(" World");
    // String s=String.format("%s%s", s1,s2);
    // String s=String.join("", s1,s2);
    // StringJoiner s=new StringJoiner(", ");
    // s.add("Hello");
    // s.add("World");
    // System.out.println(s.toString());
    /**-----------------------------------------------------------**/
    // List<String> liststr=Arrays.asList("abc", "pqr", "xyz");
    // String str=liststr.stream().collect(Collectors.joining(", "));
    // System.out.println(str.toString());
     /**--------------------------Substring--------------------------------**/
    //  String s="SachinTendulkar";
    //  System.out.println("Original String: "+s);
    //  System.out.println("Subtring starting from index 6: "+s.substring(6));
    //  System.out.println("Subtring starting from 0 to 6: "+s.substring(0,6));

    // String text=new String("Hello, My name is Sachin");
    // String[] sentences = text.split("\\.");
    // System.out.println(Arrays.toString(sentences));
    /**-----------------------------------------------------------**/
    // String s="   Sachin        ";
    // String s="Sachin";
    // System.out.println(s.toUpperCase());
    // System.out.println(s.toLowerCase());
    // System.out.println(s);
    // System.out.println(s.trim());
    // System.out.println(s.startsWith("Sa"));
    // System.out.println(s.endsWith("n"));
    // System.out.println(s.charAt(0));
    // System.out.println(s.charAt(3));
    // System.out.println(s.length());

    // String s=new String("Sachin");
    // String s2=s.intern();
    // System.out.println(s2);

    // int a=10;
    // String s=String.valueOf(a);
    // System.out.println(s+10);
    // String s1="Java is a programming language. Java is a platform. Java is a Island";
    // String replaceString=s1.replace("Java", "Kava");
    // System.out.println(replaceString);
    /**-------------------------StringBuffer-------------------------------**/
    StringBuffer sb=new StringBuffer("Hello");
    sb.append("Java");
    System.out.println(sb);
    }
/*-----------------------------------------------------------------------*/

    @Override
    public String toString() {
        return "Teststringcomparison1 []";
    }
}