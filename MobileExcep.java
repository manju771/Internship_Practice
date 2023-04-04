class InvalidMobileNumberExcemption extends Excemption{
  InvalidMobileNumberExcemption(String atr){
    super(str);
  }
}
class Mobile{
  void validateMobileNumber(String number) throws InvalidMobileNumberExcemption{
    if(number.length()==10){
      System.out.println("valid mobile number");
    }
    else{
      throw new 
        InvalidMobileNumberExcemption("Invalid Mobile Number")
    }
  }
}
class Mobile{
  public static void main(String args[]){
    CheckMobileNumber num=new CheckMobileNumber();
    try{
      num.validateMobileNumber("7760847600");
    }
catch(InvalidMobileNumberExcemption e){
  System.out.println(e)
} 
  }
}