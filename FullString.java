import java.util.Scanner;
class FullString{

  static void getCharacter(String str){
    System.out.println(str.charAt(12));
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string");
    String str1=sc.nextLine();
    System.out.println(str1);
    getCharacter(str1);
  }
}