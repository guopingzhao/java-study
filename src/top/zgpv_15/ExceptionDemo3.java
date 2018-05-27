package top.zgpv_15;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3};

        try {
            System.out.println(a / b);
            System.out.println(arr[3]);
            System.out.println("未知异常");
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { //只能平级
            System.out.println(e);
        }


        System.out.println("over");
    }
}
