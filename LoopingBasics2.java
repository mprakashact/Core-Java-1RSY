package tamilnadu.chennai;

public class LoopingBasics2 {
    public static void main(String[] args) 
    {
        LoopingBasics2 lb=new LoopingBasics2();
        // lb.print_multiple_3_and_5();
        // lb.print_multiple_3_and_5();
        // lb.print_multiple_3_or_5();
        // lb.divisors_of_given_no();
        // lb.count_of_divisors(17);
        // lb.prime_number_or_not(100 );
        // lb.find_common_divisors(100, 120);
        // lb.find_greatest_common_divisor(100,120);
        lb.find_lcm(3,200);
    }

    // private void print_multiple_3_and_5() {
    //     int no=1;
    //     while(no<=30)
    //     {
    //         if(no%3==0 && no%5==0)
    //         {
    //             System.out.print(no+" ");
    //         }
    //         no=no+1;
    //     }
    // }

    private void find_lcm(int no1, int no2) 
    {
        // int max=no1>no2?no1:no2;
        // if(max%no1==0 && max%no2==0)
        // {System.out.println("LCM is "+max);}

        int max=no1>no2?no1:no2;
        while(true)
        {
            if(max%no1==0 && max%no2==0)
            {System.out.println("LCM is "+max); break;}
            max++;
        }
    }

    private void find_greatest_common_divisor(int no1, int no2) 
    {
        int div=2;
        int last=0;
        int small=no1<no2?no1:no2;
        while(div<=small){
            if(no1%div==0 && no2%div==0)
            {
                System.out.print(div+" ");
                last=div;
            }
            div=div+1;
        }
        System.out.print("Greatest common divisor "+last);
    }

    private void find_common_divisors(int no1, int no2) 
    {
        int div=2;
        while(div<=no2)
        {
            if(no1%div==0 && no2%div==0){System.out.print(div+" ");}
            div++;
        }

    }



    private void prime_number_or_not(int no) {
        int div=2;
        int count=0;
        while(div<=(no/2))
        {
            if(no%div==0)
            {
            // System.out.print(div+" "); 
            count++;
            System.out.println("Not Prime");
            break;
            }
            div=div+1;
        }
        System.out.println("Count of Divisors "+count);
        if(count==0){System.out.println("Given no. is Prime");}
    }

    private void count_of_divisors(int no) 
    {
        int div=2;
        int count=0;
        while(div<=(no/2))
        {
            if(no%div==0)
            {
            System.out.print(div+" "); 
            count++;
            }
            div=div+1;
        }
        System.out.println("Count of Divisors "+count);    
    }


    private void divisors_of_given_no() {
        int no=120;
        int div=2;
        while(div<=(no/2))
        {
            if(no%div==0){System.out.print(div+" ");}
            div=div+1;
        }
    }

    private void print_multiple_3_or_5() {
        int no=1;
        while(no<=30)
        {
            if(no%3==0 || no%5==0)
            {
                System.out.print(no+" ");
            }
            no=no+1;
        }
    }
    
}
