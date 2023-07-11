//18. Write a JAVAprogram to print all natural numbers in reverse (from n to 1). - using while loop

import java.util.*;
public class NaturalNumRev{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the n value");
    int n=sc.nextInt();

    int i=n;
    while(i>=1){
      System.out.println(i);
      i--;
    }
  }
}