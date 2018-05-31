package top.zgpv_16;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable <Integer>{
    private int number;
    public CallableImpl(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int x = 1; x <= number; x++) {
            sum += x;
        }
        return sum;
    }
}
