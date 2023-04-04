//String Replacer: Create an application that takes a string and a word as input and replaces all occurrences of the word with another word. Use strings to manipulate the input string.
import java.util.Scanner;
class ReplaceString{
  static void replaceString(String str,String word,String replace){
    System.out.println(str.replace(word,replace));
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str="welcome to bitlabs";
    System.out.println("print enter the word you want to replace");
    String word=sc.next();
    String replace=sc.next();
    replaceString (str,word, replace); 
  }
}