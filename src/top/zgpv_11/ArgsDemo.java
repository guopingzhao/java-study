package top.zgpv_11;

import java.util.Arrays;
import java.util.List;

public class ArgsDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int result = sum("test", a, b);
        System.out.println(result);

        List<?> strs = Arrays.asList(1, 2, 3, "4", true);

        System.out.println();
    }

    public static int sum(String c, int... b) {
        System.out.println(c);
        int s = 0;
        for(int v : b) {
            s += v;
        }
        return s;
    }
}
