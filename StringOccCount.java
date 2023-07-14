//73. Write a JAVAprogram to count occurrences of a character in given string.

import java.util.*;
public class StringOccCount{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

      System.out.println("Enter the string");
      String str=sc.nextLine();//hello

    System.out.println("Enter the element to find");
    char ch=sc.next().charAt(0);//l

    int count=0;
     for(int i=0;i<str.length();i++){
       if(ch==str.charAt(i)){
        count++;
       }}
         System.out.println("Element found "+count+" times");
  }
}