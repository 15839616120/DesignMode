package com.xiangshang.singlepattern;

/**
 * @Description: 饿汉式
 * @Date: 2019/6/17 18:19
 * @Auther: wyz
 */
public class SingletonPattern {
    private static SingletonPattern instance = new SingletonPattern();
    private SingletonPattern (){}
    public static SingletonPattern getInstance() {
        return instance;
    }
}
