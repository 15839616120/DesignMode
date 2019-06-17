package com.xiangshang.factory;

/**
 * 奔驰工厂
 */
public class BenZFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new Benz();
    }
}
