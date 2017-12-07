package com.design.pattern.factorydemo;

/**
 * 具体的工厂
 * Created by zhouliang on 2017/10/19.
 */

public class FactoryImpl extends Factory{
    /*具体的创建方法*/
    @Override
    public <T extends AudiCar> T creatAudiCar(Class<T> clz) {
        AudiCar car = null;
        try {
            car = (AudiCar)Class.forName(clz.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T) car;
    }
}
