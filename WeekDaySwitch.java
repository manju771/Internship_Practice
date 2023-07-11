//16. Write a JAVAprogram to print day of week name using switch case.

import java.util.Scanner;
public class WeekDaySwitch{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the week number");
    int weekNum=sc.nextInt();
    
    String weekDay=" ";
    switch(weekNum){
      case 1:
        weekDay="sunday";
        break;
      case 2:
        weekDay="monday";
        break;
      case 3:
        weekDay="tuesday";
        break;
      case 4:
        weekDay="wednesday";
        break;
      case 5:
        weekDay="thursday";
        break;
      case 6:
        weekDay="friday";
        break;
      case 7:
        weekDay="saturday";
        break;
      default:
        System.out.println("Invalid date");
        System.exit(0);
    }
    System.out.println("The week day of "+weekNum+" is "+weekDay);
  }
}