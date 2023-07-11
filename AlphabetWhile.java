//19. Write a JAVAprogram to print all alphabets from a to z. - using while loop

import java.util.*;
public class AlphabetWhile{
  public static void main(String args[]){

    char alphabet='A';
    while(alphabet<='Z'){
      System.out.println(alphabet);
      alphabet++;
    }
  }
}