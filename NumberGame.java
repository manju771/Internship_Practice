//number guessing game 1 to 100 and print feedback for wrong guess

import java.util.Random;
import java.util.Scanner;
 public class NumberGame{
    public static void main(String args[]){
        Random ran=new Random();
        int randomNum=ran.nextInt(100)+1;
        int attempt=0;
        Scanner sc=new Scanner(System.in);
       
        while(true){
            System.out.println("Enter your guess from 1 to 100 ");
            int guess=sc.nextInt();
            attempt++;
            if(guess<randomNum){
                System.out.println("guess is too low");
            } 
            else if(guess>randomNum){
                System.out.println("guess is too high");
            }
            else{
                System.out.println("your guess is correct "+attempt);
            } 
  } }
}