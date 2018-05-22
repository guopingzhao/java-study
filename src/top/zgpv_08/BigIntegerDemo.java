package top.zgpv_08;

import java.math.BigInteger;
import java.util.Arrays;

public class BigIntegerDemo {
    public static void main(String[] args)  {
        BigInteger bigInteger = new BigInteger("2");
        BigInteger bigInteger1 = new BigInteger("1");
        System.out.println(bigInteger.add(bigInteger1));
        System.out.println(bigInteger.subtract(bigInteger1));
        System.out.println(bigInteger.multiply(bigInteger1));
        System.out.println(bigInteger.divide(bigInteger1));
        System.out.println(Arrays.toString(bigInteger.divideAndRemainder(bigInteger1)));
    }
}
