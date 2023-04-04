import java.util.*;
import java.util.Collections;

public class ShuffleElement{
  public static void main(String args[]){

    Arraylist<Integer>list=new ArrayList<Integer>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);

    Collections.shuffle(list);

    System.out.println("Shuffled ArrayList:"+list)
  }
}