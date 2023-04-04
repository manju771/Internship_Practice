import java.util.Scanner;
class Divisiblebyf{
  public static void main(String args[]){
    int i,n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    n=sc.nextInt();
    for(i=1;i<=n;i++){
    if (i%5==0){
      System.out.println(i);
}     
    }
    
  }
}