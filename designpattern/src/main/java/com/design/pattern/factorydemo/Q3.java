package com.design.pattern.factorydemo;

/**
 * Created by zhouliang on 2017/10/19.
 */

public class Q3 extends AudiCar{
    @Override
    public void startUp() {
        System.out.print("我是奥迪Q3，启动了----");
    }

    @Override
    public void cruiseControl() {
        System.out.print("我是奥迪Q3，自动巡航了----");
    }
}
