package top.zgpv_02;

import java.util.Scanner;
public class StringDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "root";
        String password = "123456";
        int index = 0;
        while (index < 3) {
            System.out.println("请输入用户名：");
            String u = sc.nextLine();
            System.out.println("请输入密码：");
            String p = sc.nextLine();

            if(user.equals(u)) {
                if (password.equals(p)) {
                    System.out.println("登录成功~");
                    GuessNumberGame.start();
                    break;
                } else {
                    System.out.println("密码输入错误！");
                }
            } else {
                System.out.println("用户不存在！");
            }
            index++;
            int c = 3 - index;
            if(c == 0) {
                System.out.println("账号已锁定！");
            } else {
                System.out.println("你还有" + c + "次机会！");
            }
        }
    }
}
