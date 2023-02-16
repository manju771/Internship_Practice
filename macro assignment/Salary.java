import java.util.Scanner;
class Salary{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double salary,anualSalary,tax=0,netSalary;
    System.out.println("Enter your Salary");
    salary=sc.nextDouble();
    anualSalary=salary+12;
    if(anualSalary<=300000){
      System.out.println("You are under minimum Salary");
      }
    else if(anualSalary>=300000&&anualSalary<=600000){
      System.out.println("You need to pay 5% of your income");
      tax=anualSalary*0.05;
    }
    else if(anualSalary>=600000&&anualSalary<=900000){
      System.out.println("You need to pay 10% of your income");
      tax=anualSalary*0.1;
       }
    else if(anualSalary>=900000&&anualSalary<=1200000){
      System.out.println("You need to pay 15% of your income");
      tax=anualSalary*0.15;
          }    
    else if(anualSalary>=1200000&&anualSalary<=1500000){
      System.out.println("You need to pay 20% of your income");
      tax=anualSalary*0.2;
        }
    else{
      System.out.println("You need to pay 30% of your income");
      tax=anualSalary*0.3;
      }
    System.out.println("Your tax is"+tax);
    netSalary=anualSalary-tax;
    System.out.println("Your net salary:"+netSalary);
  }
}