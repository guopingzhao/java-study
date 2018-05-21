package top.zgpv_03;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("hello word");

        System.out.println(sb);

        sb.insert(9, "l");

        System.out.println(sb);

        sb.deleteCharAt(0);

        System.out.println(sb);

        sb.delete(1, 3);

        System.out.println(sb);

        sb.replace(0, 2, "hello");

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);


        System.out.println(sb.substring(0, 3));

        System.out.println(isSymmetric("abcdcba"));
        System.out.println(isSymmetric("abcfdcba"));
    }

    public static boolean isSymmetric(String str) {
        StringBuffer sb = new StringBuffer(str);

        if (str.equals(sb.reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isSame(String str) {
        char[] chars = str.toCharArray();

        for (int start = 0, end = chars.length - 1; start <= end; start++, end++ ) {
            if (chars[start] != chars[end]) {
                return false;
            }
        }

        return true;
    }
}
