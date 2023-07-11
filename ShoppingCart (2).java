//You are developing a program for a retail store to calculate the total price of a customer's shopping cart. The program should ask the user to enter the prices of the items they want to purchase. The user can enter as many items as they want, and they can stop entering items by typing "-1". The program should then calculate and display the total price of the items in the shopping cart.

import java.util.*;
public class ShoppingCart{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter item price in cart");

    int price=0;
    int sum=0;
    while(price!=-1){
      price=sc.nextInt();
      
      if(price>0){
       
        sum=sum+price;
        price++;
      }
      
    }

    System.out.println("Total price of cart is"+sum);
  }
}