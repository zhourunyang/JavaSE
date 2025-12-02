package api_Date;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        System.out.println(d.getTime());

        Date d2 = new Date(d.getTime() + 60 * 1000);
        System.out.println(d2);

    }
}
