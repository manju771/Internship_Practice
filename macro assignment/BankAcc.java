//1.Bank Account: Create a class called BankAccount that simulates a bank account. The class should have methods to deposit, withdraw, and check the balance. You can also create a custom exception called InsufficientFundsException to throw when a withdrawal is attempted with insufficient funds.
import java.util.Scanner;
class InsufficientFundsException extends Exception{
  InsufficientFundsException(String str){
  super(str);
} 
}
class BankAccount{
  int balance = 50000;
  Scanner sc=new Scanner(System.in);
 void deposit(){
   System.out.println("enter the money u wish to deposit");
   int d=sc.nextInt();
   System.out.println("amount "+d+" added succesfully");
 }
  void witdraw(){
    System.out.println("enter how much money u wish to withdraw");
    int w=sc.nextInt();
    System.out.println("amount "+w+" withdrawn succesfully");
  }
  void checkBalance(){
    System.out.println("your a/c balance is="+ balance);
  }
  static void validateBank(int w) throws
  InsufficientFundsException{
    int balance =50000;
    if(w>balance){
      throw new InsufficientFundsException("insufficient funds");
    }else{
      System.out.println("your money is ready to collect");
    }
  }
}
class BankAcc{
  public static void main(String args[]){
    try{
      BankAccount.validateBank(60000);
    }
    catch(InsufficientFundsException e){
      System.out.println(e);
    }
  }
}