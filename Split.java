import java.util.Scanner;
class Split{
  
  static void split(String str){
    String word[]=str.split(" ");
    System.out.println(word.length);
    for(int i=0;i<word.length;i++){
      System.out.println(word[i]);
  }
  }
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  split(str);
}
}