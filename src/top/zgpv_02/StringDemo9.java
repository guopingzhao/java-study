package top.zgpv_02;

public class StringDemo9 {
    public static void main (String[] args) {
        String str = " Abc efs  ";
        String s1 = "hellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohellohello";
        String s2 = "hello";


        System.out.println(str.replace(" ", ""));
        System.out.println(str.trim());
        System.out.println(str.compareTo(s1));
        System.out.println(s1.compareTo(s2));

        int count = 0;
        int sl = s2.length();
        int index = -sl + 1;
        while ((index = s1.indexOf(s2, (index + sl) - 1)) != -1) {
            count++;
        }
        System.out.println(count);
    }

}
