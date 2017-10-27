package com.design.pattern;

import com.design.pattern.builderDemo.Builder;
import com.design.pattern.builderDemo.Director;
import com.design.pattern.builderDemo.MacBookBuilder;
import com.design.pattern.factoryDemo.Factory;
import com.design.pattern.factoryDemo.FactoryImpl;
import com.design.pattern.factoryDemo.Q3;
import com.design.pattern.factoryDemo.Q5;

public class MyClass {
    public static void main(String[] arg) {
//        factoryMethod();
        builderMethod();
    }
    /**
     * Builder模式
     */
    private static void builderMethod(){
        Builder mBuilder = new MacBookBuilder();
        Director mDirector = new Director(mBuilder);
        mDirector.construct("英特尔主板","Retina显示器","Mac OS x 10.10");
        System.out.print(mBuilder.create().toString());
    }

    /**
     * 工厂模式
     */
    private static void factoryMethod() {
        Factory factory = new FactoryImpl();

        Q3 q3Car = factory.creatAudiCar(Q3.class);
        q3Car.startUp();
        q3Car.cruiseControl();

        Q5 q5Car = factory.creatAudiCar(Q5.class);
        q5Car.startUp();
        q5Car.cruiseControl();
    }
}
