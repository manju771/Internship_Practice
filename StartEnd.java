import java.util.Scanner;
class StartEnd{
  
  static void validateString(String str1){
    if(str1.startsWith("M") && str1.endsWith(".com"))
    {
      System.out.println("valid");
    }
    else{
      System.out.println("not valid");
    }
  }
  public static void main(String args[]){
    validateString("Manju771@gmail.com");
  }
}