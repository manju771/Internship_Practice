//76. Write a JAVAprogram to count frequency of each character in a string

import java.util.*;
public class StringFreq{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

      System.out.println("Enter the string");
      String str=sc.nextLine();//hello

    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      int count=1;
      
      for(int j=i+1;j<str.length();j++){
        if(ch==str.charAt(j)){
          count++;
        }
    }  
      System.out.println(ch+" repeats "+count);
    }
}
}