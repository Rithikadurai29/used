import java.util.HashMap;
import java.util.Map;
public class day11 {
    static void main(String[] args) {
        Map<String, Integer> d = new HashMap<>();
        d.put("Ram",89);
        d.put("John",78);
        d.put("Aravindh",67);
        d.put("Ramesh",90);

        d.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }
}