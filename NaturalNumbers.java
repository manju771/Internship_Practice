//17. Write a JAVAprogram to print all natural numbers from 1 to n. - using while loop

import java.util.*;
public class NaturalNumbers{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    
      System.out.println("Enter the value of n");
    int n=sc.nextInt();

    int i=1;
    while(i<=n){
      System.out.println(i);
      i++;
    }
    
  }
  
}