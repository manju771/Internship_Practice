import java.util.HashMap;
import java.util.Map;

public class RetrieveValue {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        
        map.put("A", 25);
        map.put("B", 30);
        map.put("C", 35);

        
        String name = "B";
        if (map.containsKey(name)) {
            int age = map.get(name);
            System.out.println(name + " is " + age + " years old.");
        } else {
            System.out.println(name + " is not in the map.");
        }
    }
}
