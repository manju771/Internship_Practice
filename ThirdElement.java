import java.util.*;

public class ThirdElement{
  public static void main(String args[]){

    ArrayList<Integer>numbers=new ArrayList<>();

    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    System.out.println("Before removing an element:"+numbers);

    numbers.remove(2);

    System.out.println("After removing an element:"+numbers);
  }
}