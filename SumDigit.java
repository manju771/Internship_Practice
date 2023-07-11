//30. Write a JAVAprogram to calculate sum of digits of a number.


import java.util.*;
public class SumDigit{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter the digit");
    int n=sc.nextInt();//1234

    int sum=0;
   while(n!=0){
     int digit=n%10;//4
     sum=sum+digit;//4
     n=n/10;//123
   }
    
      System.out.println(sum);
}}

    
