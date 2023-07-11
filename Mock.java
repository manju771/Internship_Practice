// reverse a string

import java.util.*;
public class Mock{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);

  System.out.println("Enter the string");
  String str=sc.nextLine();

  String revStr=" ";

  for(int i=str.length()-1;i>=0;i--){
    revStr=revStr+str.charAt(i);
  }
  System.out.println("Original string"+str);
  System.out.println("Reversed string"+revStr);
}
}