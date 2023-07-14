//64. Write a JAVAprogram to find length of a string and compare and concatenate two strings.

import java.util.*;
public class StringLengthCompareConcat{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);

  System.out.println("Enter string 1");
  String str1=sc.nextLine();

  System.out.println("Enter string 2");
    String str2=sc.nextLine();

    System.out.println("String 1 length is "+str1.length());
    System.out.println("String 2 length is "+str2.length());

    String res=str1+str2;
    System.out.println("concatenation of strings are "+res);

    if(str1.equals(str2)){
      System.out.println("Strings are same");
    }else{
      System.out.println("Strings are different");
    }
  }
}