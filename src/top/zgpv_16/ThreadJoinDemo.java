package top.zgpv_16;

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadChild t1 = new ThreadChild();
        ThreadChild t2 = new ThreadChild();

        t1.start();

        t1.join();

        t2.start();
    }
}
