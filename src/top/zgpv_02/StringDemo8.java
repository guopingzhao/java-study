package top.zgpv_02;

public class StringDemo8 {
    public static void main(String[] args) {
        String str = "abcdefABCDEF";
        char[] chars = {'a', 'b'};
        int[] ints = {48, 70};
        byte[] bytes = str.getBytes();
        for(byte v : bytes) {
            System.out.print(v + ",");
        }
        System.out.println();
        char[] cs = str.toCharArray();
        for(char v : cs) {
            System.out.print(String.valueOf(v) + ",");
        }
        System.out.println();
        System.out.println(String.valueOf(chars));
        System.out.println(String.valueOf(97));
        System.out.println(str.toUpperCase());
        System.out.println(str.concat("11111111111111111111"));
        System.out.println("---------------------------------");

        System.out.println( str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
    }
}
