//10. Write a JAVAprogram to check whether a character is uppercase or lowercase alphabet.

import java.util.*;
public class UpperLowerCase{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the character");
    char c=sc.next().charAt(0);

    if(c>='A'&&c<='Z'){
      System.out.println("The character is Uppercase");
    }else if(c>='a'&&c<='z'){
      System.out.println("The character is lowercase");
    }else{
      System.out.println("The character is invalid");
    }
  }
}