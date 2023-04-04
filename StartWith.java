import java.util.Scanner;
class StartWith{

  static void validateString(String str1){
    if(str1.startsWith("M"))
    {
      System.out.println("Valid");
    }
    else{
      System.out.println("Invalid");
    }
  }
  public static void main(String args[]){
    validateString("Manjunath");
  }
}