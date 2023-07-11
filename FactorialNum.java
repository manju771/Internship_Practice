//38. Write a JAVAprogram to calculate factorial of a number.

import java.util.Scanner;
class FactorialNum{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);

   System.out.println("Enter a number");
   int num=sc.nextInt();
   
 int FACT=1;
 while(num>=1)
 {
  FACT=FACT*num;
  num--;
 }
 System.out.println("factorial of number is "+FACT);
}
}