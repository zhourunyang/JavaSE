import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class streamAPITest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"java","go","python","cpp","c","c#");
        System.out.println(names);

        List<String> ans = new ArrayList<>();
        for (String name : names) {
            if(name.startsWith("c") && name.length() == 1)
                ans.add(name);
        }
        System.out.println(ans);

        List<String> c = names.stream()
                .filter(s -> s.startsWith("c"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
        System.out.println(c);

    }
}
