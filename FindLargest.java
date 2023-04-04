import java.util.*;

public class main{
  public static int findLargest(List<Integer>numbers){
    int largest=numbers.get(0);
    for(int i=1;i<numbers.size();i++){
      if(numbers.get(i)>largest){
        largest=numbers.get(i);
      }
    }
    return largest;
  }

public static void main(String args[]){
  List<Integer>numbers=List.of(5,10,15,20,25);
  int Largest=findLargest(numbers);
  System.out.println("The largest number in the list is:"+Largest);
}
}