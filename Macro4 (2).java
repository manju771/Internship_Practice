import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
class Macro4 {
  static boolean verify(String username,String password) {
      String regex = "[a-zA-Z0-9._%+-]+[@]+[a-zA-Z]+\\.[a-z]{2,3}$";
    {
      return true;
    }else{
      return false;
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your username:");
    String username=sc.next();
    System.out.println("Enter your password:");
    Boolean op=verifyUsername(username);
    if(op=true)
      System.out.println("Valid Username");
    else
      System.out.println("Not Matched!!");
    String password=sc.nextLine();
    Boolean op=verifyUsername(password);
    if(op==true)
      System.out.println("Matched!!!");
    else 
      System.out.println("Not Matched!!!");
  }
}