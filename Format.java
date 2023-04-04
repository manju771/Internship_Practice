import java.util.*;
class Format{

  public static void main(String args[]){
    float n1=10.5f,n2=5.5f;
    float result=n1*n2;
    String result1=String.format("%10.5f",result);
    System.out.println(result1);
    String result2=String.format("5.5f",result);
    System.out.println(result2);
  }
}