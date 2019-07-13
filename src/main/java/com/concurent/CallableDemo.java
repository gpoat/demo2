package com.concurent;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2019/7/4.
 */
public class CallableDemo implements Callable<String> {


    public String call() throws Exception {
        return "String" + 1;
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        CallableDemo callableDemo = new CallableDemo();
        Future<String> future = executorService.submit(callableDemo);
        System.out.println(future.get());
    }
}
