public class StringLearningDemo 
{
/*------------------------------------------------------------------- */
    public static void main(String args[])
    {
 //-------------------------------------------------------
        // String s="abc";
        // System.out.println(s);
        // System.out.println(s.hashCode());
        
        // s="pqr";
        // System.out.println(s);
        // System.out.println(s.hashCode());   
 //-------------------------------------------------------  
    //  String s1= "Tamil Nadu";
    //  String s2= "Tamil Nadu";
    //  String s3= "Tamil Nadu";
    //  String s4= "Tamil Nadu";
    //  String s5= "Tamil Nadu";

    //  System.out.println(s1.hashCode());
    //  System.out.println(s2.hashCode());
    //  System.out.println(s3.hashCode());
    //  System.out.println(s4.hashCode());
    //  System.out.println(s5.hashCode());

    //  s1="Kerala";
    //  System.out.println(s1.hashCode());
 //------------------------------------------------------- 
     StringLearningDemo sld=new StringLearningDemo("ruban", 103);
    //  sld.countOfVowels();
    //  sld.countOfWords();
     sld.countOfSentences();
    //  String s=new String("adaikala ruban");
    //  System.out.println(sld);
    //  System.out.println(s);

    // System.out.println(s.length());

    // System.out.println(s.charAt(0));
    // System.out.println(s.charAt(1));
    // System.out.println(s.charAt(2));
    // System.out.println(s.charAt(3));
    
    }

private void countOfSentences() 
{
    String s="  gobi  ";
    System.out.println(s);
    System.out.println(s.length());
    // System.out.println(s.contains("o"));
    // System.out.println(s.contains("y"));
    // System.out.println(s.endsWith("bi"));
    // System.out.println(s.startsWith("go"));
    String s3=s.trim();
    System.out.println(s3);
    System.out.println(s3.length());

    String s2="This is my java Book. My mail id is gobi@developer.com. ";
    int i=1;
    int count=1; 
    while(i<s2.length())
    {
        if(s2.charAt(i)=='.')
         if(s2.charAt(i+1)==' ')
          count++;
          i++;
    } 
    System.out.println("No. of Sentences "+ count);
}

private void countOfWords() 
{
    String s="gobi";
    String s2="gobi krishnan";
    int i=0;
    int count=1; 
    while(i<s2.length())
    {
        if(s2.charAt(i)==' ')
         count++;
         i++;
    } 
    System.out.println("No. of words "+ count);

}

private void countOfVowels() 
{
    String s=new String("adaikala ruban");
    int i=0;
    int count =0;
    while(i<s.length())
     {
        char ch=s.charAt(i);
        switch(ch)
        {
            case 'a':
             count++;
             break;

            case 'e':
             count++;
             break;
            
            case 'i':
             count++;
             break;

            case 'o':
             count++;
             break;

            case 'u':
             count++;
             break;
        }

        // if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        //  {
        //     count++;
        //  }
        //  System.out.println(s.charAt(i)); 
         i++;
     }
     System.out.println(count); 
    
}
/*------------------------------------------------------------------- */
String name;
int id;

public StringLearningDemo(String name, int i) 
 {
    this.name=name;
    this.id=i;
 }

public String toString(){return ""+this.id;}
} 