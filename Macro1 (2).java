//Text Analyzer: Create an application that takes a text as input and performs different analysis like counting the number of characters, words, and lines, or finding the most common words.
import java.util.*;
class TextAnalyzer{
  static void analyzer(String input){
   int Lcount=1;
    int Ccount = input.length();
      String[] words = input.split("\\s+");
    int Wcount = words.length;
    for(int i=0; i<input.length(); i++){
      if(input.charAt(i)=='\n'){
        Lcount++;      
      }
    }
     System.out.println("Number of character: " +Ccount);
      System.out.println("Number of Lines :" +Lcount);
        System.out.println("Number of words :" +Wcount)
    }
  public static void main(String args[]){
      System.out.println("enter the inputn sentence");
      Scanner sc =new Scanner(System.in);
      String input = sc.nextLine();
      analyzer(input);
  }
}