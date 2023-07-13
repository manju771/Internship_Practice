//53. Write a JAVAprogram to count total number of even and odd elements in an array.


import java.util.Scanner;
class ArrayEvenOddCount{
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
      int k;
       int count=0;
      for(i=0;i<a.length;i++){
        if(a[i]%2==0){
          count++;
        }
      }
        System.out.println("total even elements are "+count);

      int count1=0;
      for(i=0;i<a.length;i++){
        if(a[i]%2!=0){
          count1++;
        }
      }
      System.out.println("total odd elements are "+count1);
    }
  }



