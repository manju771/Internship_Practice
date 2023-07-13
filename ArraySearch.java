
import java.util.Scanner;
class Arrays{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);

      int n,i,ser;
      System.out.println("Enter Size of Array:");
      n=sc.nextInt();
      int a[]=new int[n];

      System.out.println("Enter Elements to Array:");
      for(i=0;i<a.length;i++){
          a[i]=sc.nextInt();
        }
      System.out.println("The Elements in is Array is:");
      for(i=0;i<a.length;i++){
          System.out.println(a[i]);
        }
      System.out.println("Enter the value for Search:");
      ser=sc.nextInt(); //Learner Search
      for(i=0;i<a.length;i++){
          if(ser==a[i]){
            System.out.println("Element is Found");
            break;
          }}
      if(i==n){
        System.out.println("Element is Not Found");
      }}}