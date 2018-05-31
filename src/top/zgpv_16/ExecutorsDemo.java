package top.zgpv_16;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
//        Student s = new Student();
//        es.submit(new SetThread(s));
//        es.submit(new GetThread(s));

        Future<Integer> f = es.submit(new CallableImpl(100));

        System.out.println(f.get());
        es.shutdown();
    }
}
