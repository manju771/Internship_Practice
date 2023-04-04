import java.util.Scanner;
class Arraypos{
  public static void main(String args[]){
    double a[]=new double[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the values");
    for(int i=0;i<5;i++){
      a[i]=sc.nextDouble();
    }
    System.out.println("*Array Elements*");
    for(int i=0;i<5;i++){
      if(a[i]<0)
      System.out.println(a[i]); 
  }
  
  }
}