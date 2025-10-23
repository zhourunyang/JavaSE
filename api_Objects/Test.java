package api_Objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        //Objects 工具类
        String s1 = null;
        String s2 = "fa";
        //System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2));  //更安全

        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.isNull(s2));

    }
}
