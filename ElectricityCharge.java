//15. Write a JAVAprogram to input electricity unit charges and calculate total electricity bill according to the given condition:
//For first 50 units Rs. 0.50/unit   For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit  For unit above 250 Rs. 1.50/unit  An additional surcharge of 20% is added to the bill

import java.util.*;
public class ElectricityCharge{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the electricity ")
      float ele=sc.nextFloat();
    double amount=0;
    double TotalAmount=0;
    if(unit<50){
      amount=unit*0.5;
    }else if(unit<=150){
      amount=50*0.5+(unit-50)*0.75;
    }else if(unit<=250){
      amount=50*0.5+100*0.75+(unit-150)*1.2;
    }else{
      amount=50*0.5+100*0.75+100*1.2+(unit-250)*1.5;
    }
    TotalAmount=(amount+amount*0.2);
    System.out.println("total bill is"+TotalAmount);

    
  }
}
