package top.zgpv_02;

public class StringDemo7 {
    public static void main(String[] args) {
        String str = "abcdefghijkrmn";
        for(int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("------------------");

        String str2 = "AsfhADKOoF48FDF8ad7F";

        int big = 0;
        int small = 0;
        int number = 0;
        for(int x = 0; x < str2.length(); x++) {
            char c = str2.charAt(x);
            if (c >= '0' && c <= '9') {
                number++;
            }
            if (c >= 'a' && c <= 'z') {
                small++;
            }
            if (c >= 'A' && c <= 'Z') {
                big++;
            }
        }

        System.out.println("big:" + big + ", small:" + small + ", number:" + number);

    }
}
