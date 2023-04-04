import java.util.*;

public class InsertElement{
  public static void main(String args[]){
    int arr[]={1,2,3,4,5};
    int insertValue=0;

    System.out.println("Original array:"+arr.toString(array));
    System.out.println("Element to add:"+ElementToAdd);

    for(int i=arr.length-1;i>0;i--){
      arr[i]=arr[i-1];
    }
    arr[0]=ElementToAdd;

    System.out.println("Modified array:"+Arrays.toString(arr));
  }
}

