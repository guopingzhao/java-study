package top.zgpv_08;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入QQ号：");
        String str = sc.nextLine();
        System.out.println(validate(str));

        System.out.println("请输入随意字符串：");
        Matcher m = matcherNumber(sc.nextLine());
        if (m.find()) {
            System.out.println(m.group(0));            
        }
    }
    public static boolean validate(String str) {
        String pattern = "^[1-9]/d{4,14}";
        return Pattern.matches(pattern, str);
    }
    public static Matcher matcherNumber(String str) {
        Pattern r = Pattern.compile("\\D*(\\d+)\\D*.");
        Matcher m = r.matcher(str);
        return m;
    }
}
