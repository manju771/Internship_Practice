// Number Guessing Game: Create a number guessing game where the user has to guess a randomly generated number within a certain range. Use loops to repeatedly prompt the user for a guess and conditional statements to check if the guess is correct.
import java.util.Random;
import java.util.Scanner;
class Macro1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Random ran=new Random(){
    System.out.println("Enter the number");
    int guess=sc.nextInt()
    }
    int ranNum=ran.nextInt(100);
    while(true){
      if(guess!=ranNum){
      System.out.println("Enter the next number");
    guess=sc.nextInt(); 
      }
else
        System.out.println("number is correct");
      guess=sc.nextInt();
  }
}
}