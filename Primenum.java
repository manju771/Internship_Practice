import java.util.Scanner;
class Primenum{
  public static void main(String args[]){
    System.out.println("Enter n value");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    for(int i=1;i<=n;i++){
        if(n%i==0){
          count++;
        }
        }
      if(count==2){
        System.out.println("prime number:");
      }
      else
      {
      System.out.println("not a Prime number:");
      }
      }
    }
  

