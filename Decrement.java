import java.util.*;
class Decrement  {
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value");
    n=sc.nextInt();
    for(int i=n;i>=1;i--){
      System.out.println(i);
    }
  }
}