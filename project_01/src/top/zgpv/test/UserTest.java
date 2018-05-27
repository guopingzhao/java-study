package top.zgpv.test;

import top.zgpv.dao.UserDao;
import top.zgpv.dao.impl.UserDaoImpl;
import top.zgpv.game.GuessNumber;
import top.zgpv.pojo.User;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        while (true) {
            System.out.println("---------------欢迎光临----------------");
            System.out.println("1 登录");
            System.out.println("2 注册");
            System.out.println("3 退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String choiceString = sc.nextLine();
            UserDao userDao = new UserDaoImpl();

            switch (choiceString) {
                case "1":
                    System.out.println("---------------登录界面----------------");
                    User loginUser = inputUserInfo(sc);
                    boolean flag = userDao.isLogin(loginUser.getUsername(), loginUser.getPassword());
                    if (flag) {
                        System.out.println("登录成功，欢迎使用！");
                        System.out.println("你玩猜数字游戏吗？y/n");
                        String isPlay = sc.nextLine();
                        while (isPlay.equalsIgnoreCase("y")) {
                            GuessNumber.start();
                            System.out.println("还要继续玩吗? y/n");
                            isPlay = sc.nextLine();
                        }
                        System.out.println("谢谢使用，欢迎下次再来！");
                        System.exit(0);
                    } else {
                        System.out.println("用户名或密码错误，请重新登录！");
                    }
                    break;

                case "2":
                    System.out.println("---------------注册界面----------------");
                    User registerUser = inputUserInfo(sc);
                    userDao.registry(registerUser);
                    System.out.println("注册成功，欢迎使用！");
                    break;
                case "3":
                default:
                    System.out.println("谢谢使用，欢迎下次再来！");
                    System.exit(0);
            }

        }
    }

    static User inputUserInfo(Scanner sc) {
        User user = new User();
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }

}
