import java.util.*;

public class collectionTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");

        System.out.println(list);

        HashSet<String> set = new HashSet<>();
        set.add("b");
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("a");
        System.out.println(set);

        TreeSet<String> set2 = new TreeSet<>();
        set2.add("b");
        set2.add("a");
        set2.add("b");
        set2.add("c");
        set2.add("a");
        System.out.println(set2);
    }
}
