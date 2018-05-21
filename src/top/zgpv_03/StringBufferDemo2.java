package top.zgpv_03;

public class StringBufferDemo2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 + "----" + s2);
        change(s1, s2);
        System.out.println(s1 + "----" + s2);

        System.out.println("----------------");

        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("world");
        System.out.println(sb1 + "----" + sb2);
        change(sb1, sb2);
        System.out.println(sb1 + "----" + sb2);
    }

    private static void change(StringBuffer sb1, StringBuffer sb2) {
        sb1.append(sb2);
    }

    public static void change(String str1, String str2) {
        str1 += str2;
    }
}
