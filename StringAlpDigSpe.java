//65. Write a JAVAprogram to find total number of alphabets, digits or special character in a string.

import java.util.Scanner;
class StringAlpDigSpe{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the string");
    String str=sc.nextLine();

    int alp=0;
    int dig=0;
    int spe=0;
    for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
      if(ch<='z'&&ch>='a'){
        alp++;
      }else if(ch<='9'&&ch>='1'){
        dig++;
      }else{
        spe++;
      }
    }
    System.out.println("alphabets in strings are"+alp);
        System.out.println("digits in strings are"+dig);
        System.out.println("special character in strings are"+spe);
  }
}