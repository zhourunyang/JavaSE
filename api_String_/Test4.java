package api_String_;

import java.util.StringJoiner;

public class Test4 {
    public static void main(String[] args) {
        //StringJoiner
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.add("java");
        sj.add("go");
        sj.add("c");
        System.out.println(sj);

    }
}
