package top.zgpv_15;

public class ExceptionDemo2 {
    public static void main(String[] args) {
//        method1();
//        method();
        method3();
    }

    private static void method3() {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3};

        try {
            System.out.println(a / b);
            System.out.println(arr[3]);
            System.out.println("未知异常");
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println("over");
    }

    private static void method1() {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public static void method() {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("over");
    }

}
