import java.util.Scanner;
class EmployeeId{
  String name;
  double salary;
  Employee(int id,string n,string sal){
   this.employeeId=id;
  this.name=n;
    this.salary=sal;
  }
  vois grossSalary(double hra,double da){
    double totalSalary=salary+hra+da;
    System.out.println(Totalsalary);
  }
  void display(){
    System.out.println(employeeId+"  "+name+"  "+salary);
  }
}
public class employeemain{
  public static void main(String args[]){
    System.out.println("Enter Employee information");
    Scanner sc= new Scanner(System.in);
    Employee emp=new employee(sc.nextInt(),sc.next(),sc.nextDouble());
    System.out.println(EmployeeId);
    emp.display();
    emp.Employee(Id,n,sal);
  }
}

  
