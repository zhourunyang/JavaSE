import java.util.*;
import java.util.function.Consumer;

public class setTrsverseTest {
    public static void main(String[] args) {
        /*Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(6);
        set.add(1);
        set.add(8);
        set.add(88);

        //lambda
        set.forEach(System.out::println);

        //增强for
        for (Integer i : set) {
            System.out.println(i);
        }

        ///迭代器
        Iterator<Integer> it = set.iterator();
        while(it.hasNext())
            System.out.println(it.next());*/

        Set<Integer> set = new LinkedHashSet<>();
        set.add(3);
        set.add(6);
        set.add(1);
        set.add(8);
        set.add(88);

        //lambda
        set.forEach(System.out::println);

        //增强for
        for (Integer i : set) {
            System.out.println(i);
        }

        ///迭代器
        Iterator<Integer> it = set.iterator();
        while(it.hasNext())
            System.out.println(it.next());

    }
}
