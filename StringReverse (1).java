//68. Write a JAVAprogram to find reverse of a string.

import java.util.Scanner;
class StringReverse{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the string");
    String str=sc.nextLine();
    String revStr="";

    for(int i=0;i<str.length();i++){
      revStr=str.charAt(i)+revStr;
    }
    System.out.println(revStr);
  }
}  