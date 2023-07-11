//29. Write a JAVAprogram to check whether a number is palindrome or not.

import java.util.Scanner;
public class Palindrome{
  public static void main(String args[]){
Scanner sc=new scanner(System.in);
    
    System.out.println("Enter the digit")
      int n=sc.nextInt();//121
    
    while(n!=0){
      int digit=n%10;//1
      rev=rev*10+digit;//1
      n=n/10;//12
    }
    if(n=rev){
      System.out.println("It is a palindrome number");
    }
    else{
      System.out.println("Not palindrome number");
    }
  }
}