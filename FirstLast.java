//27. Write a JAVAprogram to find first and last digit of a number.

import java.util.*;
public class FirstLast{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the digit");
    int num=sc.nextInt();

    int lastDigit=num%10;

    while(num>=10){
      num=num/10;
    }
    int firstDigit=num;
    System.out.println("First digit is "+firstDigit);
     System.out.println("last digit is "+lastDigit);
    
  }
}