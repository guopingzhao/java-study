package top.zgpv_05;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 8, 6, 0, 3};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr, 6));
    }
}
