//31. Write a JAVAprogram to calculate product of digits of a number.


import java.util.*;
public class ProductDigit{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter the digit");
    int num=sc.nextInt();//1234

    int product=1;
   while(num!=0){
     int digit=num%10;//4
     product=product*digit;//4
     num=num/10;//123
   }
    
      System.out.println("product is "+product);
}}