import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {
    public static void main(String[] args) throws IOException {
        //向文件中存入键值对数据
        Properties p = new Properties();
        p.setProperty("asf", "456");
        p.setProperty("gshsh", "34646");
        p.store(new FileWriter("user.properties"), "save some users");
    }
}
