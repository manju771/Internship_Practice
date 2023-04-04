import java.util.Scanner;
class Maxoftwonum{
  public static void main(String args[]){
    int firstNumber,secondNumber;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number");
    firstNumber=sc.nextInt();
    System.out.println("Enter second number");
    secondNumber=sc.nextInt();
    if(firstNumber>secondNumber)
      System.out.println("First number is maximum number");

    else
      System.out.println("Second number is maximum number");
    
  }
}