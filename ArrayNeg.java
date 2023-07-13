//50.Write a JAVAprogram to print all negative elements in an array.

import java.util.Scanner;
class ArrayNeg{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);

      int n,i,sum=0;
      System.out.println("Enter Size of Array:");
      n=sc.nextInt();
      int a[]=new int[n];

      System.out.println("Enter Elements to Array:");
      for(i=0;i<a.length;i++){
          a[i]=sc.nextInt();
        }

      System.out.println("The negative Elements in is Array is:");
      for(i=0;i<a.length;i++){
        if(a[i]<0){
          System.out.println(a[i]);
        }
      }
    }
  }