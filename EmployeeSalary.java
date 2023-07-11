//14. Write a JAVAprogram to input basiJAVAsalary of an employee and calculate its Gross salary according to following:
//BasiJAVASalary <= 10000 : HRA = 20%, DA = 80% BasiJAVASalary <= 20000 : HRA = 25%, DA = 90% BasiJAVASalary > 20000 : HRA = 30%, DA = 95%

import java.util.*;
public class EmployeeSalary{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the basicSalary");
    int b=sc.nextInt();

   double grossSalary=0;

    if(b<=10000){
      grossSalary=b+0.2*b+0.8*b;
      System.out.println("Gross salary is"+grossSalary);
    }else if(b<=200000){
      grossSalary=b+0.25*b+0.9*b;
      System.out.println("Gross salary is"+grossSalary);
    }else if(b>200000){
      grossSalary=b+0.3*b+0.95*b;
      System.out.println("Gross salary is"+grossSalary);
    }
  }
}
  