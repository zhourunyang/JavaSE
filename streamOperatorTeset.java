import java.util.*;
import java.util.stream.Stream;

public class streamOperatorTeset {
    public static void main(String[] args) {

        //获取stream流
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"a","b","c","d");
        Stream<String> stream = names.stream();
        
        Set<String> set = new HashSet<>();
        Collections.addAll(set,"a","b");
        Stream<String> stream1 = set.stream();
        stream1.forEach(s -> System.out.println(s));



        Map<String,Integer> m = new HashMap<>();
        m.put("go", 1);
        m.put("java", 2);
        m.put("cpp", 3);

        Set<String> keySet = m.keySet();
        Stream<String> stream2 = keySet.stream();

        Collection<Integer> values = m.values();
        Stream<Integer> stream3 = values.stream();

        Set<Map.Entry<String, Integer>> entries = m.entrySet();
        Stream<Map.Entry<String, Integer>> stream4 = entries.stream();
        stream4.forEach(e -> System.out.println(e));


        String[] str = {"a","b","v"};
        Stream<String> stream5 = Arrays.stream(str);
        Stream<String> str1 = Stream.of(str);


        //中间方法
        //filter(), sort()升序, limit(), skip(), distinct(), map(), concat()

        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores,88.5, 22.4,432.4,43.4,90.8,34344.3);

        scores.stream().filter(s -> s >= 60)
                 .sorted()
                .forEach(System.out::println);

        //终结方法
        //forEach(), count(), max(), min()
        //收集stream流 collect(Collectors.toList()), toArray()


    }
}
