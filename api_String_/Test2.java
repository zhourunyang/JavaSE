package api_String_;


public class Test2 {
    public static void main(String[] args) {
        //拼接100w次abc
       /* string
        String rs = "";
        for (int i = 0; i < 1000000; i++) {
            rs += "abc";
        }
        System.out.println(rs);
        */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);

        //StringBuffer 线程安全 用法与StringBuilder相同

    }
}
