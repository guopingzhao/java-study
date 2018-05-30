package top.zgpv_16;

public class ThreadDemo {
    public static void main(String[] args){
        ThreadChild t = new ThreadChild();
        ThreadChild t2 = new ThreadChild();
        ThreadChild t3 = new ThreadChild();
        ThreadChild t4 = new ThreadChild();
        System.out.println("t" + t.getId());
        System.out.println("t2" + t2.getId());
        System.out.println("t3" + t3.getId());
        System.out.println("t4" + t4.getId());
        t.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println(t.getState());
        System.out.println("main");
    }
}

