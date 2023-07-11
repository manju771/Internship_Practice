//35.Write a JAVAprogram to print all ASCII character with their values.

import java.util.*;
public class AsciiValue{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter acsii number");
      int num=sc.nextInt();

    System.out.println("ASCII value "+num);
        System.out.println(" Character "+(char)num); 
    }
}