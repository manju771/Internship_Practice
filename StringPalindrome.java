//69. Write a JAVAprogram to check whether a string is palindrome or not.


import java.util.Scanner;
class StringPalindrome{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the string");
    String str=sc.nextLine();
    String revStr="";

    for(int i=0;i<str.length();i++){
      revStr=str.charAt(i)+revStr;
    }
    if(revStr.equals(str)){
    System.out.println("palindrome");
   }else{
      System.out.println("not palindrome");
    }
    }
}