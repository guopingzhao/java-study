package top.zgpv_07;

import java.util.Arrays;

public class CharacterDemo {
    public static void main(String[] args) {
        Character c = 'a';
        System.out.println(Character.isDigit(c));
        System.out.println(Character.isUpperCase(c));
        System.out.println(Character.isLowerCase(c));

        char a = 'a';

        System.out.println(Arrays.toString(count("ADAadfjiAJo545DFAkAdd")));
    }
    public static int[] count(String str) {
        char[] cs = str.toCharArray();
        int big = 0;
        int small = 0;
        int number = 0;

        for(char v : cs) {
            if (Character.isDigit(v)) {
                number++;
            } else if(Character.isLowerCase(v)) {
                small++;
            } else if(Character.isUpperCase(v)) {
                big++;
            }
        }
        int[] result = {big, small, number};
        return result;
    }
}
