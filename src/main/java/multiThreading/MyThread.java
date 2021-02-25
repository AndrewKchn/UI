package multiThreading;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable {

    private List<String> list;
    private char i;
    private CountDownLatch latch;

    public MyThread(List<String> list, char i, CountDownLatch latch) {
        this.list = list;
        this.i = i;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int n = 0; n < 5; n++) {
            list.add(String.valueOf(i).concat(String.valueOf(n)));
            wait(1);
            for (String s : list) {
                s.isEmpty();
            }
        }
    }

    public static void wait(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
