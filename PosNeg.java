//3. Write a JAVAprogram to check whether a number is negative, positive or zero.

import java.util.Scanner;
public class PosNeg{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number");
    int num=sc.nextInt();

    if(num>0){
      System.out.println("The number is positive");
    }else if(num<0){
      System.out.println("The number is negative");
    }else{
      System.out.println("Th number is zero");
    }
  }
}