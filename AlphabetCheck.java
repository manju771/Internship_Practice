//7. Write a JAVAprogram to check whether a character is alphabet or not.

import java.util.*;
public class AlphabetCheck{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the character");
    char c=sc.next().charAt(0);

    if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
      System.out.println("The character is alphabet");
    }else{
      System.out.println("The character is not alphabet");
    }
  }
}