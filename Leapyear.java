import java.util.Scanner;
class Leapyear{
  public static void main(String args[]){
    int y;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the year");
    int year=sc.nextInt();{
    if((year%400==0)||((year%4==0)&&(year%100!=0)))
    
          System.out.println("The year is a Leap year");
        
        else
          System.out.println("The year is not a Leap year");
    }
  }
}