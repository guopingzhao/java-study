package top.zgpv_16;

public class GetThread implements Runnable {
    private Student s;
    private int x = 0;
    public GetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (x < 20) {
            s.get();
            ++x;
        }
        System.out.println(Thread.currentThread().getName());
    }
}
