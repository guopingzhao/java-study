package top.zgpv_16;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("指定时间执行一次");
            }
        }, new Date());

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("延时执行一次");
            }
        }, 500);


        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("延时执行后每隔1秒执行一次");
            }
        }, 0, 1000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("指定时间执行一次后每隔1秒执行一次");
            }
        }, new Date(), 1000);


        File demo = new File("demo");
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = s.parse("2018-06-01 10:52:00");

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                boolean b = delDir(demo);
                System.out.println(b);
                timer.cancel();
            }
        }, date);

    }

    public static boolean delDir(File file) {
        if(file == null) return false;
        if(!file.exists()) return false;
        boolean flag;
        if(file.isDirectory()) {
            for (File f : file.listFiles()){
                flag = delDir(f);
                if (!flag) break;
            }
            flag = file.delete();
        } else {
            flag = file.delete();
        }

        return flag;
    }
}
