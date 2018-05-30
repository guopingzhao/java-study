package top.zgpv_16;

public class ThreadPriorityDemo {
    public static void main(String[] args){
        ThreadChild t1 = new ThreadChild();
        ThreadChild t2 = new ThreadChild();
        ThreadChild t3 = new ThreadChild();

        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());


        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
