//java code to guess the word from the program predefined list and user should guess the word letter by letter, after each guess it should give feedback like correctly guessed letter and the remaining letter to be guessed.

import java.util.*;

public class WordGame{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String[] wordList={"ravi","ragu","manu","deepu"};

    System.out.println("Guess the word");
    String guessedWord=sc.nextLine();

   boolean same=false;
    for (String word:wordList){
             if(guessedWord.equalsIgnoreCase(word)){
                same=true;
                break;
    }
        }
    if(same){
      System.out.println("guess is correct");
    }else{
      System.out.println("word is not there in list");
    }
    
  }
}


