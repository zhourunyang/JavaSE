import java.util.ArrayList;
import java.util.Collection;

public class collectionAPITest {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("java");
        c.add("go");
        c.add("go");
        c.add("python");
        c.add("java");
        System.out.println(c);
        System.out.println(c.isEmpty());
        System.out.println(c.size());
        System.out.println(c.contains("go"));


        System.out.println(c.remove("go"));
        System.out.println(c);


        c.clear();
        System.out.println(c);
        System.out.println(c.isEmpty());
        System.out.println(c.size());
    }
}
