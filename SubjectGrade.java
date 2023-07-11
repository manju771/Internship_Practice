//13. Write a JAVAprogram to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
//Percentage >= 90% : Grade A,Percentage >= 80% : Grade B,Percentage >= 70% : Grade C,Percentage >= 60% : Grade D,Percentage >= 40% : Grade E,Percentage < 40% : Grade F

import java.util.*;
public class SubjectGrade{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter physics marks");
    int pmarks=sc.nextInt();
    System.out.println("Enter chemistry marks");
    int cmarks=sc.nextInt();
    System.out.println("Enter biology marks");
    int bmarks=sc.nextInt();
    System.out.println("Enter mathematics marks");
    int mmarks=sc.nextInt();
    System.out.println("Enter computer marks");
    int csmarks=sc.nextInt();

    int Tmarks=pmarks+cmarks+bmarks+mmarks+csmarks;
    double percentage=((double)Tmarks/500)*100;

    String grade;
    if(percentage>=90){
      grade="A";
    }
    else if(percentage>=80){
      grade="B";
    }
    else if(percentage>=70){
      grade="C";
    }
    else if(percentage>=60){
      grade="D";
    }
    else if(percentage>=50){
      grade="E";
    }
    else{
      grade="F";
    }

    System.out.println("The grade is:"+grade);
  }
}