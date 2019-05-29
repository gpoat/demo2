package com.designmodel.singleton.safe;

/**
 * Created by Administrator on 2019/5/26.
 */
public class Test {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                public void run() {
                    System.out.println(DoubleCheckSingleton.getInstance().hashCode());
                }
            }).start();
        }
    }

}
