//11. Write a JAVAprogram to input week number and print week day.

import java.util.Scanner;
public class FindWeekDay{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the week number from 1 to 7");
    int weekNum=sc.nextInt();
    
    String[] weekDays={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};

    if(weekNum>=1&&weekNum<=7){
      String dayName=weekDays[weekNum-1];
      System.out.println("day of the week "+dayName);
    }else{
      System.out.println("invalid day number,try again");
    }
  }
}