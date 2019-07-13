package com.concurent.proccess;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Administrator on 2019/7/4.
 */
public class PrintProcess extends Thread implements ProcessRequest{

    private LinkedBlockingQueue<Request> queue = new LinkedBlockingQueue<Request>();

    private ProcessRequest processRequest;

    public PrintProcess(ProcessRequest processRequest) {
        this.processRequest = processRequest;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Request request = queue.take();
                System.out.println("print data" + request);
                processRequest.processRequest(request);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void processRequest(Request request) {
        queue.add(request);
    }
}
