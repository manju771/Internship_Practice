//39. Write a JAVAprogram to check whether a number is Prime number or not.

import java.util.*;

public class PrimeNum{
  public static void main(String a[]){
    Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
    
    for(int i=1;i<=n;i++){
      int count=0;
    for(int j=1;j<i/2;j++){
       if(i%j==0){
           count++;
       }
    }
if(count==2){
    System.out.println("Prime"+i);
}
}
}
}