import java.util.*;
class StringBuffer{
  public static void main(String args[]){
    StringBuffer str=new StringBuffer();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter String");
    str.append("StringBuffer is a mutable string and we can modify");
    System.out.println(str.lastIndexOf("m"));
    System.out.println(str.insert(40,"not"));
    System.out.println(str.delete(0,10));
  }
}