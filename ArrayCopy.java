//55. Write a JAVAprogram to copy all elements from an array to another array.

import java.util.*;
public class ArrayCopy{
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);

    int n,i,sum=0;
    System.out.println("Enter array size");
    n=sc.nextInt();
    int a[]=new int[n];
    
      System.out.println("Enter array elements");
    for(i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }  
    System.out.println("The original elements are");
      for(i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
    System.out.println("The copied elements are");
    for(i=0;i<a.length;i++){
    System.out.println(a[i]);
    }
}}  




