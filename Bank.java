class Banks{
  void rateOfInterest(){
    System.out.println("rate of interest is 10rs");
  }
}
class SBI extends Bank{
  void rateOfInterest(){
    System.out.println("12rs");
  }
}
class HDFC extends Bank{
  void print(){
    System.out.println(bid);
  }
  void rateOfInterest(){
    super.rateOfInterest( );
    System.out.println("rate of interest is 14rs");
  }
}
class Bank{
  public static void main(String args[]){
    HDFC hdfc=new HDFC();
    hdfc.rateOfInterest();
  }
}