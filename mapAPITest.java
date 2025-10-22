import java.util.HashMap;
import java.util.Map;

public class mapAPITest {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("java",1);
        m.put("java",2);
        m.put("go",2);
        m.put("python",3);

        System.out.println(m);
        System.out.println(m.size());

        //m.clear();
        //System.out.println(m);

        System.out.println(m.isEmpty());
        System.out.println(m.get("java"));
        System.out.println(m.get("go"));
        System.out.println(m.get("c"));
        System.out.println(m.remove("go"));
        System.out.println(m.containsKey("java"));
        System.out.println(m.containsKey("go"));

        System.out.println(m.containsValue(2));

        System.out.println(m.keySet());
        System.out.println(m.values());

        Map<String,Integer> m1 = new HashMap<>();
        m1.put("w",1);

        m.putAll(m1);
        System.out.println(m);
    }
}
