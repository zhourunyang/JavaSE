import java.util.ArrayList;
import java.util.List;

public class listAPITest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("gs");
        list.add("ggsgs");
        list.add("gweg");
        list.add("whwh");

        for (String s : list) {
            System.out.println(s);
        }

        list.add(2,"feagg");
        System.out.println(list);

        System.out.println(list.remove(2));
        System.out.println(list);

        System.out.println(list.get(3));

        System.out.println(list.set(2, "ggsgeg"));
        System.out.println(list);
    }
}
