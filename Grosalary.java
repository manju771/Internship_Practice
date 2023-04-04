import java.util.Scanner;
class Grosalary{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your salary");
    double basic=sc.nextDouble();
    double hra,da,grossSalary;
    if(basicSalary<=10000){
      hra= basicSalary*0.2;
      da = basicSalary*0.8;
    }
    else if(basicSalary<=20000&&basicSalary>=10000){
      da = basic*0.9;
      hra = basic*0.25;
    }
    else{
      da = basic*0.95;
      hra = basic*0.3;
    }
    grossSalary = basicSalary+hra+da;
    System.out.println("Gross Salary is="+grossSalary);
  }
}