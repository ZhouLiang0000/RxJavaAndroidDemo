package com.design.pattern.factoryDemo;

/**
 * 抽象工厂类
 * Created by zhouliang on 2017/10/19.
 */

public abstract class Factory {
    /*创建方法*/
    public abstract <T extends AudiCar> T creatAudiCar(Class<T> clz);
}
