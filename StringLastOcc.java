//71. Write a JAVAprogram to find last occurrence of a character in a given string.

import java.util.*;
public class StringLastOcc{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

      System.out.println("Enter the string");
      String str=sc.nextLine();//hello

    System.out.println("Enter the element to find");
    char ch=sc.next().charAt(0);//l
      
     for(int i=str.length()-1;i>0;i--){
       if(ch==str.charAt(i)){
        
         System.out.println("Element found at "+i);
         break;
       }
     }
  }
}