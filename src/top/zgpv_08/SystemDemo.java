package top.zgpv_08;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) {
            System.out.println("hello" + i);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
        int[] arr = {1, 2, 3, 4, 5, 8, 9};
        int[] arr2 = {22, 33, 44, 55};
        System.arraycopy(arr, 1, arr2, 2, 2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
