//51. Write a JAVAprogram to find second largest element in an array.

import java.util.Scanner;
class SecondLargest{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);

      int n,i,j;
      System.out.println("Enter Size of Array:");
      n=sc.nextInt();
      int a[]=new int[n];

      System.out.println("Enter Elements to Array");
      for(i=0;i<a.length;i++){
          a[i]=sc.nextInt();
        }

      
      for(i=0;i<a.length;i++){
        for(j=i+1;j<a.length;j++){
          if(a[i]>a[j]){

            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
          }
        }
      }
      System.out.println("The second largest Element in Array is"+a[a.length-2]);
    }
  }