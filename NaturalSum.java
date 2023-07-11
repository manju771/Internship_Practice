//22. Write a JAVAprogram to find sum of all natural numbers between 1 to n.

import java.util.Scanner;
public class NaturalSum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

   System.out.println("Enter the n value");
    int n=sc.nextInt();

    int sum=0;
    for(int i=0;i<=n;i++){
      sum=sum+i;
    }
      System.out.println("sum is"+sum);
    
  }
}