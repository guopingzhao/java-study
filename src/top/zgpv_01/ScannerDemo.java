package top.zgpv_01;

/**
 * ScannerDemo
 */
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("num:" + num);
        } else {
            System.out.println("你输入的不是数字!");
        }
        System.out.println("---------------------");

        if (sc.hasNext()) {
            String str = sc.next();
            System.out.println("str:" + str);
        }
        System.out.println("---------------------");

        if(sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println("line:" + line); 
        }
        System.out.println("---------------------");
    }
}