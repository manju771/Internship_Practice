//32. Write a JAVAprogram to enter a number and print its reverse.

import java.util.*;
public class RevNum{
  public static void main(String args[]){
Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the digit");
      int n=sc.nextInt();//121

    int rev=0;
    while(n!=0){
      int digit=n%10;//1
      rev=rev*10+digit;//1
      n=n/10;//12
    }
  
      System.out.println("reverse of number is "+rev);
  }
}