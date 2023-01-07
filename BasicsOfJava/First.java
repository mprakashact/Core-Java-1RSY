public class First {
   public static void main(String args[]) {

 
   }

   
/** 3. Documentation Comment
 */
//1. singleline comment = //
/*
 *2. Multiline Comment = /* */
 /*
  * 
 */

   /*

   do{
   System.out.println("infinite do-While Loooooooooooop !!!. System is Crashed Press clt+c");
}while(true);
     

   while(true){
      System.out.println("infinite While Loooooooooooop !!!. System is Crashed Press clt+c");
     }

    for(;;){
         System.out.println("infinite Loooooooooooop !!!. System is Crashed Press clt+c");
      }
      

   int arr[] = {10, 20, 30, 40, 50};
      for(int i:arr){
         System.out.println(i);
      }

   int term=6;
 for(int i=1; i<=term; i++){
   for(int j=term; j>=i; j--){
      System.out.print("* ");
   }
      System.out.println();
 }
      
    * 

    for(int i=1; i<=5; i++){
   for(int j=1; j<=i; j++){
      System.out.print("* ");
   }
   System.out.println();
 }

 System.out.println();
 System.out.println();

 for(int i=1; i<=5; i++){
   for(int j=1; j<=i; j++){
      System.out.print(j +" ");
   }
   System.out.println();
 }

    for (int i=0; i<=3; i++){
         for (int j=0; j<=3; j++){
            System.out.println(i +" "+j);
         }
      }
      
    int age = 2;
      int a = 1;

      switch (age) 
      {
         case 1:
            System.out.println("1 is print");
            switch(a) 
            {
               case 1:
               System.out.println("a 1 is also again print");
               break;
            }
            break;
         case 2:
            System.out.println("2 Printed");
            break;
         default:
         System.out.println("Default Value");
               }
    * 
    * int age = 40;
    * boolean voterId = false;
    * 
    * if (age >= 18){
    * System.out.println("Your Elgible for vote in Election");
    * if (voterId==true){
    * System.out.println("Your Apply for Voter Id So Good");
    * System.out.println("You Put a vote for Your Allocated VoterBooth");
    * } else{
    * System.out.println("Your Not-Apply for Voter Id So Bad");
    * System.out.
    * println("You First Apply in voterId then Next Year Put a vote for Your Allocated VoterBooth"
    * );
    * }
    * }
    * else{
    * System.out.println("Your Not-Elgible for vote in Election");
    * }
    * 
    * for(int i = 0; i<=10; i++){
    * System.out.println("HEllo WORLD !!! :" + i);
    * if(i==5) {
    * System.out.println("I am in Danger !");
    * continue;
    * }
    * }
    * System.out.println("I Got Excaped in 5th Time in this Area");
    * 
    * Jump Statements:
    * int i;
    * for (i=0; i<10; i++) {
    * if(i==5){
    * continue;
    * } else if (i==8){
    * break;
    * } else {
    * System.out.println("Value is : " + i);
    * }
    * 
    * }
    * LOOPS::
    * for-each loop:
    * int arr[] = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    * int sum =0;
    * for(int x: arr){
    * System.out.println(x);
    * sum += x;
    * }
    * System.out.println("Total Sum: " + sum);
    * 
    * for (int i=0; i<arr.length; i++) {
    * System.out.println("Array :" + arr[i]);
    * }
    * System.out.println(arr[0]);
    * 
    * for loop:
    * for (int number = 25; number != 50; number++) {
    * System.out.println ("FOR :" + number);
    * }
    * 
    * while loop:
    * int number = 10;
    * while (number <= 20) {
    * System.out.println("while loop: " + number);
    * number++;
    * }
    * 
    * do-while loop:
    * int num =1;
    * do {
    * System.out.println(num);
    * num++;
    * } while(num <= 0);
    * System.out.println(num);
    * 
    * Control Statements::
    * switch (a){
    * case 1:
    * System.out.println("One");
    * break;
    * case 2:
    * System.out.println("Two");
    * break;
    * case 3:
    * System.out.println("Three");
    * break;
    * default:
    * System.out.println("Other Numbers");
    * Logical Operator:
    * && = All Conditions are True Result is True
    * || = Any One Condition is True Result is True
    * ! Not = Opposit (True are False & False are True)
    * 
    * int a = 100;
    * int b = 200;
    * System.out.println("AND :"+ ((a>=b) && (a==b)));
    * System.out.println("OR :"+ ((a>=b) || (a==b) || (b>a)));
    * System.out.println("AND :"+ (a!=b));
    * 
    * Ternary Operator:
    * int a = 18;
    * int b = 20;
    * System.out.println(a>b?a:b);
    * System.out.println(a<b?a:b);
    * 
    * //Assignment Operator:
    * int a = 2;
    * System.out.println(a);
    * a +=2;
    * System.out.println(a);
    * a -=2;
    * System.out.println(a);
    * a *=2;
    * System.out.println(a);
    * a /=2;
    * System.out.println(a);
    * a %=2;
    * System.out.println(a);
    * 
    * If Statements::
    * int num = 10;
    * if (num == 10){
    * System.out.println(" Your number is Equal to 10.");
    * } else if (num > 10){
    * System.out.println(" Your number is greater than 10.");
    * } else {
    * System.out.println(" Your number is less than 10.");
    * }
    */
}