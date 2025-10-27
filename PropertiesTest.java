import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        System.out.println(p);
        //加载属性文件
        p.load(new FileReader("user.properties"));
        System.out.println(p);
        //键取值
        System.out.println(p.getProperty("x"));
        //遍历
        Set<String> keys = p.stringPropertyNames();
        for(String key : keys) {
            String value = p.getProperty(key);
            System.out.println(key + "-->" + value);
        }

        p.forEach((k, v) -> {
            System.out.println(k + "-->" + v);
        });

    }
}
