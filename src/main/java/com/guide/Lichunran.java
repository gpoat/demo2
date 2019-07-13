package com.guide;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2019/7/4.
 */
public class Lichunran {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        MyThread t1 = new MyThread();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t1);
        Thread thread3 = new Thread(t1);
        executorService.submit(thread1);
        executorService.submit(thread2);
        executorService.submit(thread3);
        executorService.shutdown();
    }



}

class MyThread implements Runnable {

    private int count;

    public void run() {
        synchronized(this) {
            while(count < 100) {
                System.out.println(Thread.currentThread().getName() + " " + count++);
            }
        }
    }
}
