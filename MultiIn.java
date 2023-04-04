class Animal{
  void eat(){
    System.out.println("eating");
  }
}
class Dog extends Animal{
  void bark(){
    System.out.println("barking");  
  }
}
class BabyDog extends Dog{
  void cry(){
    System.out.println("crying");
  }
}
class MultiIn{
  public static void main(String args[]){
    BabyDog d=new BabyDog();
    d.cry();
    d.bark();
    d.eat();
  }
}


