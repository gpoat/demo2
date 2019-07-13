package com.concurent;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2019/7/5.
 */
public class InterruptDemo {

    private static int i;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
           while(!Thread.currentThread().isInterrupted()) {
                    i++;
           }
            System.out.println(i);
        });
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();
    }
}
