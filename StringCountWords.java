//67. Write a JAVAprogram to count total number of words in a string.

import java.util.Scanner;
class StringCountWords{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the string");
    String str=sc.nextLine();
    String word[]=str.split(" ");
    System.out.println("Total words are "+word.length);
  }
}

//import java.util.Scanner;
//class WordCount
 // {
  //  public static void main(String args[])
   // {
  //    Scanner sc=new Scanner(System.in);
 //     System.out.println("enter the text :");
//      String s=sc.nextLine();
//      String words[]=s.split(" ");
  //    System.out.println("no of words in the text are //:"+words.length);
  //  }
  //}