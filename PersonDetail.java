import java.util.ArrayList;

class Person{
 String name;
  int age;

  public Person(String name,int age){
    this.name=name;
    this.age=age;
  }
  }
public class PersonDetail{
  public static void main(String args[]){
    ArrayList<Person>people=new ArrayList<Person>();
    people.add(new Person("A",26));
    people.add(new Person("B",23));
    people.add(new Person("C",28));
    people.add(new Person("D",31));
    people.add(new Person("E",24));
    people.add(new Person("F",25));
    people.add(new Person("G",30));

    for(Person person:people){
      System.out.println(person.name+"is"+person.age+"years old.");
    }

    Person oldestPerson=people.get(0);
    for(int i=1;i<people.size();i++){
      if(people.get(i).age>oldestPerson.age){
        
        oldestPerson=people.get(i);
      }
    }
    System.out.println(oldestPerson.name+"is the oldest person"+oldestPerson.age+".");
  }
}