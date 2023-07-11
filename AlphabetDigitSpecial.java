//9. Write a JAVAprogram to input any character and check whether it is alphabet, digit or special character.

import java.util.*;
public class AlphabetDigitSpecial{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter a character");
    char ch=sc.next().charAt(0);

    if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
      System.out.println("Given character is alphabet");
    }else if(ch>='1'&&ch<='9'){
      System.out.println("Given character is digits");
    }else{
      System.out.println("Given charcater is a special character");
    }
  }
}