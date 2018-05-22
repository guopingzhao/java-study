package top.zgpv_08;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(0.1 + 0.2);

        BigDecimal bigDecimal = new BigDecimal("0.1");
        BigDecimal bigDecimal1 = new BigDecimal("0.2");
        BigDecimal bigDecimal2 = new BigDecimal("1.0");
        BigDecimal bigDecimal3 = new BigDecimal("0.32");
        BigDecimal bigDecimal4 = new BigDecimal("0.015");
        BigDecimal bigDecimal5 = new BigDecimal("100");
        BigDecimal bigDecimal6 = new BigDecimal("1.301");

        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal2.subtract(bigDecimal3));
        System.out.println(bigDecimal4.multiply(bigDecimal5));
        System.out.println(bigDecimal6.divide(bigDecimal5));
        System.out.println(bigDecimal6.divide(bigDecimal5, 2, BigDecimal.ROUND_HALF_UP));
    }
}
