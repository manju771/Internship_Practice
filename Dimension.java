//Write a program that demonstrates method overriding. Define a superclass called Shape with a method called getArea() that returns 0. Define two subclasses, Circle and Rectangle, that extend Shape and override the getArea() method to calculate and return the area of their respective shapes. In the main method, create instances of both Circle and Rectangle and call their getArea() methods.
class Shape{
  double getArea(){
    return 0.0;
  } 
}
class Circle extends Shape{
  double getArea(){
    int r=5;
    double area=(22/7)*(r*r);
    return area;
  }
}
  class Rectangle extends Shape{
    double getArea(){
      int l=2,b=3;
      double area=l*b;
      return area;
    }
  }
class Dimension{
  public static void main(String args[]){
    Circle area=new Circle();
    Rectangle rectangle=new Rectangle();
    double result;
    result=area.getArea();
    System.out.print("result"+result);
  }
}
  
