package com.designmodel.singleton.safe;

/**
 * Created by Administrator on 2019/5/26.
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton singleton;

    public static DoubleCheckSingleton getInstance() {

        if(singleton == null) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (DoubleCheckSingleton.class) {
                if(singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
