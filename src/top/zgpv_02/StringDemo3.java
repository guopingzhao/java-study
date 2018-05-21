package top.zgpv_02;

public class StringDemo3 {
    public static void main(String[] args) {
        String s = "hello";
        String s2 = new String("hello");
        System.out.println( s == s2); //false
        System.out.println( s.equals(s2)); //true
    }
}
