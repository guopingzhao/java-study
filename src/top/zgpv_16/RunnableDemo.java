package top.zgpv_16;

public class RunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        RunnableImpl r = new RunnableImpl();
//        Thread t = new Thread(r);
//        t.setName("child");

        Thread t = new Thread(r, "child1");
        Thread t2 = new Thread(r, "child2");
        t.start();
        t2.start();

        Thread.sleep(1000);

        System.out.println(r.data.length());
    }
}
