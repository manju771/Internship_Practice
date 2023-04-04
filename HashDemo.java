import java.util.HashMap;

public class HashDemo {
  public static void main(String[] args) {
  
    HashMap<String, Integer> map = new HashMap<>();

    
    map.put("A", 25);
    map.put("B", 30);
    map.put("C", 35);

    
    System.out.println("HashMap contents: " + map);
  }
}
