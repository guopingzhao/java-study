package top.zgpv_16;

public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadChild t1 = new ThreadChild();
        ThreadChild t2 = new ThreadChild();
        t1.setDaemon(true);
        t2.setDaemon(true);
        t1.start();
        t2.start();

        Thread.currentThread().setName("current");

        for (int x = 0; x < 5; x++) {
            System.out.println(Thread.currentThread().getName() + ": " + x);
        }

        System.out.println("XXXXXX");

//        t1.interrupt();
//        t2.interrupt();

    }
}
