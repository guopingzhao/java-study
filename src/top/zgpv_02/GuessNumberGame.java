package top.zgpv_02;

import java.util.Scanner;

public class GuessNumberGame {
    public static void start() {
        int number = (int)(Math.random() * 100 + 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        while (true) {
            int n = sc.nextInt();

            if(n > number) {
                System.out.println("数字大了");
            } else if (n < number) {
                System.out.println("数字小了");
            } else {
                System.out.println("恭喜！");
                break;
            }
        }
    }
}
