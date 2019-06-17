package com.xiangshang.factory;

/**
 * 测试类
 */
public class FactoryTest {

    public static void main(String[] args) {
        BmwFactory bmwFactory = new BmwFactory();
        System.out.println(bmwFactory.getCar().getName());
        BenZFactory benZFactory = new BenZFactory();
        System.out.println(benZFactory.getCar().getName());
    }
}
