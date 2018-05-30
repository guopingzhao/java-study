package top.zgpv_16;

public class RunnableImpl implements Runnable {
    public StringBuffer data = new StringBuffer();
    @Override
    public void run() {
        for (int x = 0; x < 100; x++) {
            data.append(1);
        }

        System.out.println("自定义子线程类");
        System.out.println(Thread.currentThread().getName());
    }
}
