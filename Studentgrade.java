import java.util.Scanner;
class Studentgrade{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Grade in sub1");
    int sub1=sc.nextInt();
    System.out.println("Enter the Grade in sub2");
    int sub2=sc.nextInt();
    System.out.println("Enter the Grade in sub3");
    int sub3=sc.nextInt();
    int avg=(sub1+sub2+sub3)/3;
    System.out.println("Avg Grade:"+avg);
  }
}