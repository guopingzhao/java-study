package top.zgpv_06;

public class IntegerDemo {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(100));
        System.out.println(Integer.toOctalString(100));
        System.out.println(Integer.toHexString(100));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.parseInt("123"));

        Integer num = new Integer(12);
        Integer num1 = new Integer("1213");

        System.out.println(num + ", " + num1);
    }
}
