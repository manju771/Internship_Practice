import java.util.HashMap;
import java.util.Map;

public class IterateValue {
    public static void main(String[] args) {
      
        Map<String, Integer> map = new HashMap<>();

        
        map.put("A", 25);
        map.put("B", 30);
        map.put("C", 35);

           for (int value : map.values()) {
            System.out.println("Age: " + value);
        }
    }
}
