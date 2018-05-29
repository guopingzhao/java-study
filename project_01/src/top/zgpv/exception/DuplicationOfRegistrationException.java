package top.zgpv.exception;

public class DuplicationOfRegistrationException extends RuntimeException {
    public DuplicationOfRegistrationException() {
        super("请勿重复注册！");
    }

    public DuplicationOfRegistrationException(String message) {

        super(message);
    }
}
