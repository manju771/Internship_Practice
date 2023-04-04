//Write a program that takes a string as input and outputs all possible permutations of the characters in the string. How could you optimize your program to handle long input strings with many repeated characters?
import java.util.Scanner;
 class StringPermutation{

   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a string:");
     String input=scanner.nextLine();
     List<String>permutations=generatePermutations(str);
     System.out.println(permutations);
   }
   public static List<String>generatePermutations(String str){
     List<String>permutations=new ArrayList<>();
     if(input.length()==0){
       permutations.add("");
       return permutations;
     }
     char firstChar=input.charAt(0);
     String remainingString=input.substring(1);
     ArrayList<String>words=getPermutations(re)
   }
 }