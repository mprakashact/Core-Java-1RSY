package tamilnadu.chennai;

import tamilnadu.madurai.Rules;

public class LoopingBasics implements Rules
{
    // private int a,b,c,d,e,f;
    // public LoopingBasics(int a, int b, int c, int d, int e, int f) {
    //     this.a = a;
    //     this.b = b;
    //     this.c = c;
    //     this.d = d;
    //     this.e = e;
    //     this.f = f;
    // }

    // public int getA() {
    //     return a;
    // }

    // public void setA(int a) {
    //     this.a = a;
    // }

    // public int getB() {
    //     return b;
    // }

    // public void setB(int b) {
    //     this.b = b;
    // }

    // public int getC() {
    //     return c;
    // }

    // public void setC(int c) {
    //     this.c = c;
    // }

    // public int getD() {
    //     return d;
    // }

    // public void setD(int d) {
    //     this.d = d;
    // }

    // public int getE() {
    //     return e;
    // }

    // public void setE(int e) {
    //     this.e = e;
    // }

    // public int getF() {
    //     return f;
    // }

    // public void setF(int f) {
    //     this.f = f;
    // }

    public static void main(String args[])
    {
        LoopingBasics lb=new LoopingBasics();
        // lb.tenali_story();
        // lb.print_1s();
        // lb.print_12345();
        // lb.print_3579();
    }

    private void print_12345()
    {
        int no=1;
        while(no<=5)
        {
            System.out.print(no+" ");
            no=no+1;
        }
    }

    private void print_3579()
    {
        int no=1;
        while(no<=10)
        {
            // if(no%2!=0)
            System.out.print(no+" ");
            no=no+2;
        }
    }


    private void print_1s() 
    {
        // System.out.print(1+" ");
        // System.out.print(1+" ");
        // System.out.print(1+" ");
        // System.out.print(1+" ");
        // System.out.print(1+" ");
        int i=1;
        while(i<=5)
        {
            System.out.println(1+" ");
            i++;
        }
    }


    // private void tenali_story() { }

    @Override
    public void follow() {
        // TODO Auto-generated method stub
        
    }
}