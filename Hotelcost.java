import java.util.Scanner;
class Hotelcost{
  public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Rate of Room");
    int rateofroom=sc.nextInt();
    System.out.println("Enter the number of nights stayed");
    int nights=sc.nextInt();
    System.out.println("Total cost:"+rateofroom*nights);
    }
}