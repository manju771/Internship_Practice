import java.util.TreeSet;

public class JoinElements{
  public static void main(String args[]){

    TreeSet<Integer>set1=new TreeSet<Integer>();
    set1.add(10);
    set1.add(20);
    set1.add(30);

    TreeSet<Integer>list2=new TreeSet<Integer>();
    set1.add(40);
    set1.add(50);
    set1.add(60);

    set1.addAll(list2);

    System.out.println("Joined ArrayList:"+set1);
    
  }
}