//25. Write a JAVAprogram to print multiplication table of any number.

import java.util.*;
public class MultiplicationTable{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the number to multiply");
    int n=sc.nextInt();

    
    for(int i=1;i<=10;i++){
      int res=n*i;
        

        System.out.println(n+"*"+i+"="+res);
        
      
      
    }
  }
}