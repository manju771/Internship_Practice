class Animal
  {
    String color;
    String name;
  void Walk()
    {
      System.out.println("walking");
    }}
class Dog extends Animal{
  int no_of_legs;
  void bark()
  {
  System.out.println("Dog is barking");
  }
}
class BabyDog extends Dog{
  int age;
  void sleep()
  {
  System.out.println("Sleeping");
  }
void display(){
  System.out.println("Color of the animal"+color+"name"+name);
  System.out.println("Number of legs "+no_of_legs+""+" age of baby dog"+age);
  
  
}
}
class MultilevelInheritence{
  public static void main(String args[]){
    BabyDog babyDog=new BabyDog();
    babyDog.color="White";
    babyDog.name="Rambo";
    babyDog.Walk();
    babyDog.no_of_legs=4;
    babyDog.bark();
    babyDog.age=3;
    babyDog.sleep();
    babyDog.display();
    }
}