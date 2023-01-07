package OOPsMisc.ObjectClass;

public class StringLearnings {
    
    int price;
    
    public static void main(String[] args) 
{
    String s=new String();
    System.out.println("Hashcode pfg s: "+s);

    StringLearnings sl=new StringLearnings();
    System.out.println("Hashcode pfg sl: "+sl); 
    // OP: OOPsMisc.ObjectClass.StringLearnings@3fee733d = @3fee733d = last hashCode its a hexadecimal code
    sl.price=100;

    StringLearnings sl2=new StringLearnings();
    sl2.price=100;
    System.out.println("hashCode of sl2: "+sl2);
    System.out.println(sl2.hashcode());


     
    if (sl.equals(sl2)){System.out.println("Both Objects are Equal");} 
    else{System.out.println("Both Objects are Not-Equal");}
}


    public boolean equals (Object ob)
    {
     StringLearnings s=(StringLearnings)ob; 
     if(this.price==s.price)
       return true;
     else 
       return false;
    } //Override the equals method
    public int hashcode(){return 123;} //Override the hashcode method
    public String toString(){return "Hi";} //tostring() method is overriding
}