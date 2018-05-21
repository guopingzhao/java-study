package top.zgpv_02;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.hashCode());
        s += " world";

        System.out.println(s.hashCode());
    }
}
