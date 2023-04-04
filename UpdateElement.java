import java.util.*;

public class UpdateElement{

  public static void main(String args[]){

    int array[]={1,2,3,4,5};
    int index=1;
    int newElement=0;

    System.out.println("Original array:"+Arrays.toString(array));
    System.out.println("Index to update:"+index);
    System.out.println("New element:"+newElement);

    array[index]=newElement;

    System.out.println("Modified array:"+Arrays.toString(array));
  }
}