//74. Write a JAVAprogram to find highest frequency character in a string.

import java.util.*;
public class StringHighFreq{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

      System.out.println("Enter the string");
      String str=sc.nextLine();//hello

    int maxFreq=0;
    char maxElement=0;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      int count=1;
      
      for(int j=i+1;j<str.length();j++){
        if(ch==str.charAt(j)){
          count++;
        }
    }  
      if(count>maxFreq){
        maxFreq=count;
        maxElement=ch;
      }
    }
    System.out.println("max frequency is "+maxElement);
}
}