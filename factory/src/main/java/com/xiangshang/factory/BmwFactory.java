package com.xiangshang.factory;

/**
 * 宝马工厂
 */
public class BmwFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
