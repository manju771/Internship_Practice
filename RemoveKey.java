import java.util.HashMap;
import java.util.Map;

public class RemoveKey {
    public static void main(String[] args) {
       
        Map<String, Integer> map = new HashMap<>();

        
        map.put("A", 25);
        map.put("B", 30);
        map.put("C", 35);

        
        String name = "C";
        if (map.containsKey(name)) {
            int age = map.remove(name);
            System.out.println(name + " (" + age + ") has been removed from the map.");
        } else {
            System.out.println(name + " is not in the map.");
        }

       
        System.out.println("HashMap contents: " + map);
    }
}
