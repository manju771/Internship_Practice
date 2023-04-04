class InvalidAmountExcemption extends Excemption{
    InvalidAmountExcemption(String str){
      super(str);
    }
  }
  class ATM{
    int balance=20000;
    void withdraw(int withdrawAmount)throws InvalidAmountExcemption{
      if(withdrawAmount>balance)
      {
        throw newInvalidAmountExcemption("Invalid Amount:Insufficient balance");
      }
    else
      if(withdrawAmount%100!=0){
        throw newInvalidAmountExcemption("InvalidAmount:Amount should be multiples of 100");
      }
      else{
        balance=balance-withdrawAmount;
        System.out.println("Success");
      }
  }
}
class AtmExcemption{
  public static void main(String args[]){
    ATM atm=new ATM();
    try{
      atm.withdraw(55012);
    }
    catch(InvalidAmountExcemption e){
      System.out.println(e);
    }
  }
}
  