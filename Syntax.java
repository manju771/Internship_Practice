className objectName = new class();
Inheritance

class childClass extends parentClass {
    //code;
  Polymorphism
1. Compile-time polymorphism:

public class MyClass {
    public void myMethod(int x) {
        // method implementation
    }
 public void myMethod(String s) {
        // method implementation
    }
}
2. Run-time polymorphism:

public class MyClass {
    public void myMethod(int x) {
        // method implementation
    }
    public void myMethod(String s) {
        // method implementation
      
i. Abstract Classes and Abstract Methods:

public class MySubclass extends MyClass {
    @Override
    public void myMethod() {
        // method implementation
    }
}

ii. Interfaces

public interface MyInterface {
   
    public void myMethod(); // abstract method declaration
}

Get method syntax:

public returnType getFieldName() {
    return fieldName;
}

Set method syntax:

public void setFieldName(dataType newValue) {
    fieldName = newValue;
}