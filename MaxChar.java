//You are working on a project where you need to find the maximum occurring character in a given string. Your task is to write a program that takes a string as input and returns the character that appears most frequently in the string.
import java.util.Scanner;
class MaxChar{
  public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();

      char a[] = str.toCharArray();
    for(int i=0; i<a.length; i++){
      for(int j=0; j<i; j++){
        if(a[i]==a[j]){
          System.out.println(a[i]);
      }
    }
  }
  }
}