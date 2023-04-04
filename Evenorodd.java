import java.util.Scanner;
class Evenorodd{
 public static void main(String args[]){
   int number;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number");
   number=sc.nextInt();
     if(number%2==0){
     System.out.println("yes! it is even");
     }
   else
   {
     System.out.println("no! it is odd");
   }
 }
}