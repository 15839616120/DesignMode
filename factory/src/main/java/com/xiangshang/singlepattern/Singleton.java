package com.xiangshang.singlepattern;

/**
 * @Description: DDL懒汉模式
 * @Date: 2019/6/17 18:17
 * @Auther: wyz
 */
public class Singleton {
    private volatile static Singleton singleton;  
    private Singleton (){}  
    public static Singleton getSingleton() {  
    if (singleton == null) {  
        synchronized (Singleton.class) {  
        if (singleton == null) {  
            singleton = new Singleton();  
        }  
        }  
    }  
    return singleton;  
    }  
}
