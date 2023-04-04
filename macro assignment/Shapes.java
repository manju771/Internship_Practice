//2.Shapes: Create classes for different shapes (e.g. Circle, Rectangle, Triangle) that all extend a base Shape class. Each class should have methods to calculate the area and perimeter of the shape. You can also create a custom exception called InvalidDimensionsException to throw when the dimensions of a shape are invalid.
import java.util.Scanner;
class InvalidDimensionsException extends Exception{
  InvalidDimensionsException(String str){
  super(str);
} 
}
class Circle{
 void Area(int r){
  double area = 3.14*r*r;
   System.out.println("area of circle ="+area);
 }
  void CirclePerimeter(int r){
  double peri=3.14*2*r;
   System.out.println("area of circle ="+peri);
  }
  static void validateCircle(int r) throws
  InvalidDimensionsException{
    if(r>50){
      throw new InvalidDimensionsException("insufficient circle");
    }else{
      System.out.println("Valid circle");
    }
  }
}
 void validateCircleArea(int r) throws InvalidDimensionsException{
    if(r<=0){
      throw new InvalidDimensionsException("enter the radius greater than zero");
    }
    else{
      area=pi*r*r;
      System.out.println("the area of circle is "+area);
    }
  }
class Rectangle{
 void RectArea(int l,int b){
  double area = l*b;
   System.out.println("area of Rectangle ="+area);
 }
  void RectanglePerimeter(int l,int b){
  double peri=2*(l+b);
   System.out.println("area of rectangle ="+peri);
  }
  static void validateRectangle(int l,int b) throws
  InvalidDimensionsException{
    if(l>60){
      throw new InvalidDimensionsException("insufficient dimension");
    }else{
      System.out.println("Valid rectangle");
    }
  }
}
 void validateRectangleArea(int r) throws InvalidDimensionsException{
    if((l<0)&&(b<0)){
      throw new InvalidDimensionsException("enter the dimension is greater");
    }
    else{
      area=2*(l+b);;
      System.out.println("the area of Rectangle is "+rectangle);
    }
  }
class Shapes{
  public static void main(String args[]){
    Circle cir=new Circle();
    Rectangle rec=new Rectangle();
      try{
      rec.RectArea(0,0);
    }
    catch(InvalidDimensionsException e){
      System.out.println(e);
    }
    try{
      rec.RectanglePerimeter(0,0);
    }
    catch(InvalidDimensionsException e){
      System.out.println(e);
    }
    try{
      cir.Area(0);
    }
    catch(InvalidDimensionsException e){
      System.out.println(e);
    }
    try{
      cir.CirclePerimeter(0);
    }
    catch(InvalidDimensionsException e){
      System.out.println(e);
    }
    }
  }


