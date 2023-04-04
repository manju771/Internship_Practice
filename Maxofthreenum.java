import java.util.Scanner;
class Maxofthreenum{
  public static void main(String args[]){
    int firstNumber,secondNumber,thirdNumber;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number");
    firstNumber=sc.nextInt();
    System.out.println("Enter the second number");
    secondNumber=sc.nextInt();
    System.out.println("Enter the third number");
    thirdNumber=sc.nextInt();

    if((firstNumber>secondNumber)&&(firstNumber>thirdNumber))
      System.out.println("First number is maximum number");

    else if((secondNumber>firstNumber)&&(secondNumber>thirdNumber))
      System.out.println("Second number is maximum number");

    else
      System.out.println("Third number is maximum number");
    
  }
}
