package top.zgpv_04;

import static top.zgpv_04.ListTool.bubble;
import static top.zgpv_04.ListTool.choice;

public class ListDemo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 0, 4, 6, 2, 8, 6, 7};
        String str = "ahsfjpAsfmshafnfsdAJIDAjsfjAYhd";

        int[] arr1 = bubble(arr);
        for (int v : arr1) {
            System.out.print(v + ",");
        }
        System.out.println();

        System.out.println("-------------------");

        int[] arr2 = choice(arr);
        for (int v : arr2) {
            System.out.print(v + ",");
        }
        System.out.println();

        System.out.println("-------------------");


        System.out.println(bubble(str.getBytes()));
    }


}
