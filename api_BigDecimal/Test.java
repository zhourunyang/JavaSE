package api_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        //解决浮点数运算，结果失真  BigDecimal
        System.out.println(0.1 + 0.2);  //0.30000000000000004

        //BigDecimal b1 = new BigDecimal(Double.toString(0.1));
        //BigDecimal b2 = new BigDecimal("0.2");

        BigDecimal b1 = BigDecimal.valueOf(0.1);
        BigDecimal b2 = BigDecimal.valueOf(0.3);

        BigDecimal b3 = b1.add(b2);
        System.out.println(b3);

        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(b1.divide(b2, 3, RoundingMode.HALF_UP));

    }
}
