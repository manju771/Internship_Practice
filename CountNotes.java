//12. Write a JAVAprogram to count total number of notes in given amount.

import java.util.*;
public class CountNotes{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

      System.out.println("Enter the amount");
    int a=sc.nextInt();

    int n2000,n500,n200,n100,n50,n20,n10,n5;
    n2000=n500=n200=n100=n50=n20=n10=n5=0;

    if(a>=2000){
      n2000=a/2000;
      a=a-n2000*2000;
      System.out.println("Number of 2000 notes are="+n2000);
    }
    if(a>=500){
      n500=a/500;
      a=a-n500*500;
      System.out.println("Number of 500 notes are="+n500);
    }
    if(a>=200){
      n200=a/200;
      a=a-n200*200;
      System.out.println("Number of 200 notes are="+n200);
    }
    if(a>=100){
      n100=a/100;
      a=a-n100*100;
      System.out.println("Number of 100 notes are="+n100);
    }
    if(a>=50){
      n50=a/50;
      a=a-n50*50;
      System.out.println("Number of 50 notes are="+n50);
    }
    if(a>=20){
      n20=a/20;
      a=a-n20*20;
      System.out.println("Number of 20 notes are="+n20);
    }
    if(a>=10){
      n10=a/10;
      a=a-n10*10;
      System.out.println("Number of 10 notes are="+n10);
    }
    if(a>=5){
      n5=a/5;
      a=a-n5*5;
      System.out.println("Number of 5 notes are="+n5);
    }
    
    System.out.println("Total number of notes are="+(n2000+n500+n200+n100+n50+n20+n10+n5));
  }
}