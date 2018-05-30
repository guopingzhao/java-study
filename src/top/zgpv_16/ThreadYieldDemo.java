package top.zgpv_16;

public class ThreadYieldDemo {
    public static void main(String[] args) {
        ThreadChild t1 = new ThreadChild();
        ThreadChild t2 = new ThreadChild();

        t1.start();
        t2.start();
    }
}
