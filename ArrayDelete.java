//56. Write a JAVAprogram to delete an element from an array at specified position.

import java.util.*;
public class ArrayDelete{
  public static void main(String arg[]){
    Scanner sc=new Scanner(System.in);

    int n,i=0;
    System.out.println("Enter array size");
    n=sc.nextInt();
    int a[]=new int[n];
    
      System.out.println("Enter array elements");
    for(i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }  
   System.out.println("Enter which position element to delete");
    int pos=sc.nextInt();
    for(i=pos;i<a.length-1;i++){
      a[i]=a[i+1];
    }
    n--;
    System.out.println("Array after deleting");
    for(i=0;i<n;i++){
      System.out.println(a[i]+" ");
    }
}}  