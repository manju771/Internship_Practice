import java.util.Scanner;
class Student{
  int rollno;
  String name;
  String branch;

  Student(){
    rollno=16;
    name="manju";
    branch="bt";
  }
  void display(){
    System.out.println(rollno+"  "+name+"  "+"  "+branch);
  }
  }
class StringDemo{
  public static void main(String args[]){
    Student st=new Student();
    st.display();
  }
}