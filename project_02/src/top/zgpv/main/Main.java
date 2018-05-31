package top.zgpv.main;

public class Main {
    public static void main(String[] args) {
        RunnableImpl r = new RunnableImpl();

        Thread t1 = new Thread(r, "窗口1");
        Thread t2 = new Thread(r, "窗口2");

        t1.start();
        t2.start();

    }
}
