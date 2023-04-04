import java.util.HashMap;
import java.util.Map;

public class IterateKey {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();

        
        map.put("A", 25);
        map.put("B", 30);
        map.put("C", 35);

        
        for (String key : map.keySet()) {
            int value = map.get(key);
            System.out.println(key + " is " + value + " years old.");
        }
    }
}
