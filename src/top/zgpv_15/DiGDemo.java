package top.zgpv_15;

import java.math.BigInteger;

public class DiGDemo {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(compute(2));
        System.out.println(compute(7));
    }

    public static BigInteger factorial(int num) {
        if (num <= 1) {
            return BigInteger.valueOf(1);
        }
        return factorial(--num).multiply(BigInteger.valueOf(num));
    }

    public static int compute(int num) {
        if (num <= 2) return 1;
        return compute(num - 2) + compute(num - 1);
    }
}
