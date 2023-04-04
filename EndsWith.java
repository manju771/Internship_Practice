import java.util.Scanner;
class EndsWith{

  static void validateString(String str1){
    if(str1.endsWith("h"))
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