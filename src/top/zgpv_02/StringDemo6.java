package top.zgpv_02;

public class StringDemo6 {
    public static void main(String[] args) {
        String str = "abcdefghijkrmn";

        System.out.println(str.length()); //14
        System.out.println(str.charAt(10)); //k
        System.out.println(str.indexOf("c")); //2
        System.out.println(str.indexOf(97)); //0
        System.out.println(str.indexOf("c", 5)); //-1
        System.out.println(str.substring(1)); //bcdefghijkrmn
        System.out.println(str.substring(2, 5)); //cde
    }
}
