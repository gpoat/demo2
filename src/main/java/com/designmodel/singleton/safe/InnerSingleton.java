package com.designmodel.singleton.safe;

/**
 * Created by Administrator on 2019/5/22.
 */
public class InnerSingleton {

    private static class Singleton {
        private static Singleton single = new Singleton();
    }

    public static Singleton  getInstance() {
        return Singleton.single;
    }
}
