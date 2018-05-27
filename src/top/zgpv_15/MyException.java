package top.zgpv_15;

public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    public MyException() {
        super("分数应该在0-100之间");
    }
}
