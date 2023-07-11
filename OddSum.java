//24. Write a JAVAprogram to find sum of all odd numbers between 1 to n.

import java.util.Scanner;

public class OddSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        
        int sum=0;
        int number=1;
        
        while(number<=n){
            if(number%2!=0){
                sum+=number;
            }
            number++;
        }
        
        System.out.println("The sum of odd numbers from 1 to "+n+"is "+sum);
    }
}
