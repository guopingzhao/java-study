package top.zgpv_04;

import static top.zgpv_04.ListTool.bubble;
import static top.zgpv_04.ListTool.twoPoint;

public class ListDemo2 {
    public static void main(String [] args) {
        int[] arr = {2, 3, 4, 6, 2, 6, 8, 1, 9, 0, 4, 5, 6};
        int[] arr1 = bubble(arr);

        System.out.print("[");
        for(int v : arr1) {
            System.out.print(v + ", ");
        }
        System.out.print("]");
        System.out.println();

        System.out.println(twoPoint(arr1, 4));
    }
}
