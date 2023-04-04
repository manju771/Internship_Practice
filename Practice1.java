//1.Employee
//eid,ename,esalary
//array of employees  to add employees using setters
//display the employee information using getters
//validations:
//5 employee id is unique 7 digit
//length greater than 5
//esalary length greater than 5 to 10characters
class Employee{
  private int eid;
  private String ename;
  private string esalary; 

  public void setEid(int eid){
    if(eid<100000||eid>999999){
      System.out.println("Invalid employee ID:"+eid);
      return;
    }
    this.eid=eid;
  }
  public void setEname(String ename){
    if(ename.length()<5){
      System.out.println("Employee name must be at least 5 characters ");
      return;
    }
    this.ename=ename;
  }
  public void setEsalary(String esalary){
    if(esalary.length()<5||esalary.length()>10){
      System.out.println("Invalid salary:"+esalary);
      return;
    }
    this.esalary=esalary;
  }
  public int getEid(){
    return eid;
  }
  public String getEname(){
    return ename;
  }
  public String getSalary(){
    return esalary;
  }
}


  