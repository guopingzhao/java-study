package top.zgpv.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void start() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        int count = 0;
        System.out.println("请输入1-100");
        while (true) {
            int n = sc.nextInt();
            count++;
            if (n > number) {
                System.out.println("数字大了！再接再厉！");
            } else if (n < number) {
                System.out.println("数字小了！再接再厉！");
            } else {
                System.out.println("恭喜你！" + count + "次就猜中了");
                break;
            }
        }
    }
}
