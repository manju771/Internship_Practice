import java.util.HashMap;
import java.util.Map;

public class ClearKey {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();

       
        map.put("A", 25);
        map.put("B", 30);
        map.put("C", 35);

        
        map.clear();

      
        int size = map.size();
        System.out.println("The size of the HashMap is now: " + size);
    }
}
