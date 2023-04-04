import java.util.Scanner;
class Sumofpositive{
  public static void main(String args[]){
    int number,digit,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of positive numbers:");
  number=sc.nextInt();
    while(number>0){
        digit=number%10;
    sum=sum+digit;
    number=number/10;}
    System.out.println("Sum of digits:"+sum);
  }
}