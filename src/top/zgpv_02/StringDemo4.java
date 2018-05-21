package top.zgpv_02;

public class StringDemo4 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "HELLO";
        String s3 = "hello world";
        String s5 = "";
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); //true
        System.out.println(s3.contains(s1)); //true
        System.out.println(s3.startsWith(s1)); //true
        System.out.println(s3.endsWith(s1)); //false
        System.out.println(s5.isEmpty()); //true
    }
}
