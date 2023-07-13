
import java.util.Scanner;
class Arrays{
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

      System.out.println("The Elements in Array is:");
      for(i=0;i<a.length;i++){

          System.out.println(a[i]);
          sum=sum+a[i];
        }
      System.out.println("The Sum of an Array is:"+sum);
    }
  }