import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class collectiTraverseTest {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("gw");
        c.add("fe");
        c.add("ge");
        c.add("fag");

        System.out.println(c);

        //迭代器
        Iterator<String> it = c.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //增强for
        for (String s : c) {
            System.out.println(s);
        }

        //lambda
        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        c.forEach((String s) -> {
            System.out.println(s);
        });

        c.forEach(s -> System.out.println(s));

        c.forEach(System.out::println );
    }
}
