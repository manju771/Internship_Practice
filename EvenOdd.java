//5. Write a JAVAprogram to check whether a number is even or odd.

import java.util.*;
public class EvenOdd{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number");
    int num=sc.nextInt();

    if(num==0){
      System.out.println("Number is Invalid");
    }else if(num%2==0){
      System.out.println("Number is even");
    }else if(num%2!=0){
      System.out.println("Number is odd");
    }
  }
}