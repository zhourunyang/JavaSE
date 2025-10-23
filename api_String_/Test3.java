package api_String_;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(getArrayData(new int[]{11, 22, 33}));

    }

    public static String getArrayData(int[] a) {
        if(a == null)
            return null;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < a.length; i++) {
            if(i == a.length - 1)
                sb.append(a[i]);
            else
                sb.append(a[i]).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
