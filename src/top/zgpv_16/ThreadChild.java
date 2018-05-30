package top.zgpv_16;

class ThreadChild extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int x = 0; x < 200; x++) {
//            System.out.println("child: id:" + this.getId() + ", name:" + this.getName() + ", time:" + System.currentTimeMillis() + "x: " + x);
            Thread.yield();
        }
    }
}
