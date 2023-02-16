import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
    class Agecalc{
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your date of birth");
        String birthDate;
          birthDate=sc.next();
        LocalDate today=LocalDate.now();
        System.out.println(today);
        DateTimeFormatter dateFormat= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dateOfBirth= LocalDate.parse(birthDate,dateFormat);
        Period age=Period.between(dateOfBirth,today);
          System.out.println(age.getYears());
         if(age.getYears()>=18){
        System.out.println("Your an Adult");
      }
      else{
        System.out.println("Your a minor");  
      }
    }
    }