import java.util.*;
class Contaibs{

  static void contains(String str){
    if(str.contains("@")){
      System.out.println("valid");
    }
    else{
      System.out.println("invalid");
    }
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter email id");
    String str=sc.nextLine();
    contains(str);
  }
}