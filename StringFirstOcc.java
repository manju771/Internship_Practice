//70. Write a JAVAprogram to find first occurrence of a character in a given string.

import java.util.*;
public class StringFirstOcc{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

      System.out.println("Enter the string");
      String str=sc.nextLine();//hello

    System.out.println("Enter the element to find");
    char ch=sc.next().charAt(0);//l
      
     for(int i=0;i<str.length();i++){
       if(ch==str.charAt(i)){
        
         System.out.println("Element found at "+i);
         break;
       }
     }
  }
}