package top.zgpv_16;

public class RunnableImpl implements Runnable {
    public static StringBuilder data = new StringBuilder();
    @Override
    public void run() {
//        for (int x = 0; x < 200; x++) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            synchronized (this) {
//                data.append(1);
//            }
//        }
//
//        System.out.println("自定义子线程类");
//        System.out.println(Thread.currentThread().getName() + ", time: " + System.currentTimeMillis());
//
//        try {
//            asyncFunction();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        try {
            asyncStaticFunction();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void asyncFunction() throws InterruptedException {
        for (int x = 0; x < 200; x++) {
            Thread.sleep(100);
            data.append(1);
        }

        System.out.println("自定义子线程类");
        System.out.println(Thread.currentThread().getName() + ", time: " + System.currentTimeMillis());
    }

    public static synchronized void asyncStaticFunction() throws InterruptedException {
        for (int x = 0; x < 200; x++) {
            Thread.sleep(100);
            data.append(1);
        }

        System.out.println("自定义子线程类");
        System.out.println(Thread.currentThread().getName() + ", time: " + System.currentTimeMillis());
    }
}
