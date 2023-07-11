//26. Write a JAVAprogram to count number of digits in a number.

import java.util.*;
public class CountDigit{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
  
  System.out.println("Enter the digit");
    int n=sc.nextInt();//n=12345

    int count=0;
    for(int temp=n;temp>0;temp/=10){
    
      count++;
    }
      System.out.println(count);
    
    }
}