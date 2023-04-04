import java.util.Scanner;
class Posnegzer{
  public static void main(String args[]){
    int number;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number");
    number=input.nextInt();
    if(number>0){
      System.out.println("Positive number");
    }
    else if(number<0){
      System.out.println("Negative number");
    }
    else{
      System.out.println("Zero");
    }
    }
  }

