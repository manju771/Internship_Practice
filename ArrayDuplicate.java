//59. Write a JAVAprogram to count total number of duplicate elements in an array.


import java.util.*;
public class ArrayDuplicate{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter array size");
    int n=sc.nextInt();
    int a[]=new int[n];
    int[] freq=new int[n];
    
    System.out.println("Enter elements");
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
   for(int i=0;i<a.length;i++){
     int count=1;
     for(int j=i+1;j<a.length;j++){
       if(a[i]==a[j]){
         count++;
         a[j]=0;
       }
     }
     if(a[i]!=0){
       freq[i]=count;
     }
   }
    System.out.println("Frequency of duplicate element");
    for(int i=0;i<n;i++){
     if(freq[i]>1){
        System.out.println(a[i]+" occurs "+freq[i]+" times ");
     }
    }
  }
}