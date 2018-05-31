package top.zgpv_16;

public class StudentDemo {
    public static void main(String[] args) throws InterruptedException {
//        method();
        method2();

    }

    private static void method2() {
        Student s = new Student();
        SetThread set = new SetThread(s);
        GetThread get = new GetThread(s);

        ThreadGroup tg = new ThreadGroup("new");

        Thread t1 = new Thread(tg, set, "set");
        Thread t2 = new Thread(tg, get, "get");

        System.out.println(t1.getThreadGroup().getName());
        System.out.println(t2.getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());

        t1.start();
        t2.start();
    }

    private static void method() {
        Student s = new Student();
        SetThread set = new SetThread(s);
        GetThread get = new GetThread(s);

        Thread t1 = new Thread(set, "set");
        Thread t2 = new Thread(get, "get");

        System.out.println(t1.getThreadGroup().getName());
        System.out.println(t2.getThreadGroup().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());

        t1.start();
        t2.start();
    }


}
