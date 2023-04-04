class InvalidAgeException 
  extends Exception{
  InvalidAgeException(String str){
    super(str);
  }
}
class VoteEligibility{
  static void validateAge(int age)throws
  InvalidAgeException{
    if(age<18){
      throw new InvalidAgeException("Invalid Age");
    }
    else{
      System.out.println("Eligible");
    }
  }
}
class Age{
  public static void main(String args[]){
    try{
      VoteEligibility.validateAge(23);
        }
    catch(InvalidAgeException e){
      System.out.println(e);
    }
  }
}