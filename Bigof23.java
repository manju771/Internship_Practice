import java.util.Scanner;
class Bigof23{
  static int maxNumber(){
    int num1=5;int num2=10;
    if(num1>num2){
      return num1;
    }
    else{
      return num2;
    }
  }
  public static void main(String args[]){
    int max=Bigof23.maxNumber();
    System.out.println(max);
  
  }
}