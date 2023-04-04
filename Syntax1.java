import java.util.*;
class Syntax1{
  public static void main(String args[]){
    List<Integer>is=new ArrayList<Integer>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++){
      is.add(sc.nextInt());
    }
    for(Integer num:is){
      if(num%2==0){
        System.out.println(num);
      }
    }
  }
}