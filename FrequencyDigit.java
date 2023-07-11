//33. Write a JAVAprogram to find frequency of each digit in a given integer.

import java.util.Scanner;
public class FrequencyDigit{
  public static void main(String args[]){
Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the digit");
      int num=sc.nextInt();//121

    int[] digitFrequency=calculateDigitFrequency(num);

    for(int i=0;i<10;i++){
      if(digitFrequency[i]!=0){
        System.out.println("digit "+i+" repeats "+digitFrequency[i]+" times");
      }
    }
  }
  public static int[] calculateDigitFrequency(int num){
    int[] digitFrequency=new int[10];
    
    while(num>0){
      int digit=num%10;//1
     digitFrequency[digit]++;//1
      num=num/10;//12
    }
    return digitFrequency;
  }
  }
