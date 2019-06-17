package com.xiangshang.singlepattern;

/**
 * @Description: 懒汉式，线程安全
 * 必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * @Date: 2019/6/17 18:20
 * @Auther: wyz
 */

public class Sin {
    private static Sin instance;
    private Sin (){}
    public static synchronized Sin getInstance() {
        if (instance == null) {
            instance = new Sin();
        }
        return instance;
    }
}

