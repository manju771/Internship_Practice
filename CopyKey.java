import java.util.HashMap;
import java.util.Map;

public class CopyKey {
    public static void main(String[] args) {
        
        Map<String, Integer> sourceMap = new HashMap<>();

        
        sourceMap.put("A", 25);
        sourceMap.put("B", 30);
        sourceMap.put("C", 35);

       
        Map<String, Integer> destMap = new HashMap<>();

        
        destMap.putAll(sourceMap);

        
        for (Map.Entry<String, Integer> entry : destMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
