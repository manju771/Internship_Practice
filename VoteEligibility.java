import java.util.Scanner;
class VoteEligibility{
  public static void main(String args[]){
    int age;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter age");
    age=sc.nextInt();
    if(age>=18){
      System.out.println("yes!The person is eligible");
    }
    else{
      System.out.println("Oh No!The person is not eligible");
    }
    }
  }
