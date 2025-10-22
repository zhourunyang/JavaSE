import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class mapTrsverseTest {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("java",1);
        m.put("java",2);
        m.put("go",2);
        m.put("python",3);
        m.put("cpp",4);
        System.out.println(m);


        //键找值
        Set<String> keys = m.keySet();
        System.out.println(keys);

        for (String key : keys) {
            int value = m.get(key);
            System.out.println(key + "--->" + value);
        }

        //键值对
        Set<Map.Entry<String, Integer>> entries = m.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }

        //lambda
        m.forEach((k,v) -> {
            System.out.println(k + "--->" + v);
        });


        m.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String k, Integer v) {
                System.out.println(k + "--->" + v);
            }
        });

    }
}
