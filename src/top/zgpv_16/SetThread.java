package top.zgpv_16;

public class SetThread implements Runnable {
    private Student s;
    private int x = 0;

    public SetThread(Student s) {
        this.s = s;
    }


    @Override
    public void run() {
        while (x < 20) {
                if (x % 2 == 0) {
                    s.set("林青霞", 27);
                } else {
                    s.set("国平", 23);
                }
            ++x;
        }
        System.out.println(Thread.currentThread().getName());
    }
}