import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class setAPITest {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(6);
        set.add(1);
        set.add(8);
        set.add(88);
        System.out.println(set);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(3);
        set2.add(6);
        set2.add(1);
        set2.add(8);
        set2.add(88);
        System.out.println(set2);
    }
}
