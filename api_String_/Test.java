package api_String_;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        sb.append(12);
        sb.append("heima");
        sb.append(true);
        System.out.println(sb);

        String s = sb.toString();
        System.out.println(s);

    }
}
