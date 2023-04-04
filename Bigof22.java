import java.util.Scanner;
class Bigof22{
  static int maxNumber(int num1,int num2){
    if(num1>num2){
      return num1;
    }
    else{
      return num2;
    }
  }
  public static void main(String args[]){
    int max=Bigof22.maxNumber(10,20);
    System.out.println(max);
  
  }
}