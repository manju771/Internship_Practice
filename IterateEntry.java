import java.util.HashMap;
import java.util.Map;

public class IterateEntry {
    public static void main(String[] args) {
       
        Map<String, Integer> map = new HashMap<>();

       
        map.put("A", 25);
        map.put("B", 30);
        map.put("C", 35);

        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " is " + value + " years old.");
        }
    }
}
