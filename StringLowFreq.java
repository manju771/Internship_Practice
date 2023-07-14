//75. Write a JAVAprogram to find lowest frequency character in a string.



import java.util.*;
public class StringLowFreq{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

      System.out.println("Enter the string");
      String str=sc.nextLine();//hello

    int minFreq=0;
    char minElement=0;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      int count=1;
      
      for(int j=i+1;j<str.length();j++){
        if(ch==str.charAt(j)){
          count++;
        }
    }  
      if(count<minFreq){
        minFreq=count;
        minElement=ch;
      }
    }
    System.out.println("min frequency is "+minElement);
}
}