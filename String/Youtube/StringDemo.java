package String.Youtube;

public class StringDemo 
{
/*---------------------------------------------------------------------------*/
    public static void main(String args[])
    {
        StringDemo sd=new StringDemo();
        String[] names={"naresh", "raju", "muthuselvi"};
        sd.joinwords(names);
    
    }
/*---------------------------------------------------------------------------*/
    private void joinwords(String[] names) 
    {
    /**-----------------------STRINGBUFFER & STRINGBUILDER-----------------------**/
    //StringBuffer:
        // String sentence = "";
        // StringBuffer sb=new StringBuffer(""); 
        // StringBuffer sb2=new StringBuffer("raja"); 
    
        // // sb2.insert(1, 'a');
        // System.out.println(sb2);
        // sb2.replace(0, 2, "ka"); //including 0, excluding 2--> 01
        // System.out.println("After replacing "+sb2.reverse());
        // // // for-loop:
        // // for(int i=0; i<names.length; i++)
        // //  System.out.println(names[i]);

        // //for-each-loop or Unidirectional loop-forward direction loop:
        // for(String name:names) //for each STRING, NAME in NAMES
        // {
        //     sb.append(name);
        //     System.out.println("StringBuffer HashCode: "+sb.hashCode());
        //     sentence = sentence+name; //""+-->"nareshrajumuthuselvi"  
        //     System.out.println("String HashCode: "+sentence.hashCode());
        // } 
        // System.out.println(sentence);
        // System.out.println(sb);
        // //for-loop features:
        // //1. Only forward Direction
    /**--------------------------------------------------------------------------**/
    //StringBuilder:
        String sentence = "";
        StringBuffer sb=new StringBuffer(""); 
        StringBuffer sb2=new StringBuffer("raja"); 

        StringBuilder bui=new StringBuilder("");
        System.out.println(bui.hashCode());
        bui.append("naresh");
        System.out.println(bui);
        System.out.println(bui.hashCode());
        //System.out.println(bui.reverse());
        System.out.println(bui.replace(0, 2, "su")); 
    }
}