package com.concurent.proccess;

import org.junit.Test;

/**
 * Created by Administrator on 2019/7/4.
 */
public class Demo {

    private PrintProcess printProcess;

    private SaveProcess saveProcess;

    public Demo() {
        saveProcess = new SaveProcess();
        saveProcess.start();
        printProcess = new PrintProcess(saveProcess);
        printProcess.start();
    }

    @Test
    public void test() {
        Request request = new Request("task");
        printProcess.processRequest(request);
    }
}
