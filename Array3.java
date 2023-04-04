import java.util.Scanner;
class ArrayDemo{
  public static void main(String args[]){
    //declare varaible
    int a[]=new int[5];
    int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter values");
    //read data
    for(int i=0;i<5;i++){
     a[i]=sc.nextInt();
   }
    
    //print sum
    System.out.println("****** sum of Array Elements******");
    for(int i=0;i<5;i++){
        sum=sum+a[i];
      }
    System.out.println(sum);
      
    
  }
}