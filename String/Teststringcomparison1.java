package String;

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
    // StringBuffer sb=new StringBuffer("Hello ");
    // StringBuffer sb=new StringBuffer();
    // System.out.println(sb.capacity());
    // sb.append("Hello");
    // System.out.println(sb.capacity());
    // sb.append("java is my favourite language");
    // System.out.println(sb.capacity());
    // sb.ensureCapacity(10);
    // System.out.println(sb.capacity());
    // sb.ensureCapacity(50);
    // System.out.println(sb.capacity());

    // sb.append("Java");
    // sb.insert(1,"Java");
    // sb.replace(1,3, "Java");
    // sb.delete(1,3);
    // sb.reverse();
    // System.out.println(sb);
    /**-------------------------StringBuilder-------------------------------**/
    // StringBuilder sb=new StringBuilder("Hello ");
    // StringBuilder sb=new StringBuilder();
    // sb.append("Java");
    // sb.insert(1, "Java");
    // sb.replace(1,3,"Java");
    // sb.delete(1, 3);
    // sb.reverse();
    // System.out.println(sb.capacity());
    // sb.append("Hello");
    // System.out.println(sb.capacity());
    // sb.append("Java is my favorite language");
    // System.out.println(sb.capacity());
    // sb.ensureCapacity(10);
    // System.out.println(sb.capacity());
    // sb.ensureCapacity(50);
    // System.out.println(sb.capacity());
    /**----------------------String vs StringBuffer-------------------------**/
    // long startTime = System.currentTimeMillis();
    // concatWithString();
    // System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");

    // startTime = System.currentTimeMillis();
    // concatWithStringBuffer();
    // System.out.println("Time taken by Concating with StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");

    //hascode Test:
    // System.out.println("Hashcode test of String:");
    // String str="java";
    // System.out.println(str.hashCode());
    // str=str+"tpoint";
    // System.out.println(str.hashCode());

    // System.out.println("Hashcode test of StringBuffer:");
    // StringBuffer sb=new StringBuffer("java");
    // System.out.println(str.hashCode());
    // sb.append("tpoint");
    // System.out.println(str.hashCode());
    /***-------------------StringBuffer vs StringBuilder-------------------***/
    long startTime=System.currentTimeMillis();
    StringBuffer sb=new StringBuffer("Java");
    for(int i=0; i<10000; i++){sb.append("Tpoint");}
    System.out.println("Time taken by StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");

    startTime=System.currentTimeMillis();
    StringBuilder sb2=new StringBuilder("Java");
    for(int i=0; i<10000; i++){sb2.append("Tpoint");}
    System.out.println("Time taken by StringBuilder:"+(System.currentTimeMillis()-startTime+"ms"));
    /**-----------------------------------------------------------**/
    }    
/*-----------------------------------------------------------------------*/
/***----------------------String vs StringBuffer-------------------------***/
    // public static String concatWithString()
    //  {
    //     String t="Java";
    //     for(int i=0; i<10000; i++)
    //      {
    //         t=t+"Tpoint";
    //      }
    //     return t;
    //  }

    // public static String concatWithStringBuffer()
    //  {
    //     StringBuffer sb=new StringBuffer("Java");
    //     for(int i=0; i<10000; i++)
    //      {
    //         sb.append("Tpoint");
    //      } 
    //      return sb.toString();
/***---------------------------------------------------------------------***/
}