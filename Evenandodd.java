import java.util.*;
class Evenandodd{
  public static void main(String args[]){
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    int n,sum=0;
    int n = sc.nextInt();
      for(i=1;i<=n;i++){
         if(i%2==0){
        System.out.println("Even number's are : " + i);
      }
        else{
          System.out.println("Odd number's are : " + i);
        }
      }
  }
}