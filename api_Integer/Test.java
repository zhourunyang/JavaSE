package api_Integer;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //Integer a1 = new Integer(12);
        Integer a2 = Integer.valueOf(13);
        //System.out.println(a1);
        System.out.println(a2);

        //自动装箱
        Integer a3 = 13;
        System.out.println(a3);

        //自动拆箱
        int a4 = a3;
        System.out.println(a4);

        //泛型和集合支持引用数据类型
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(Integer.valueOf(14));
        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("--------------------------");
        Integer a = 32;
        System.out.println(Integer.toString(a) + 1);

        String s2 = a.toString();
        System.out.println(s2 + 32);

        String age = "24";
        int age1 = Integer.valueOf(age);
        System.out.println(age1 + 1);
    }
}
