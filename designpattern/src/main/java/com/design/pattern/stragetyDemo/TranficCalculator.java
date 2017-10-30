package com.design.pattern.stragetyDemo;

/**
 * 作者：zhouliang
 * 时间：2017/10/30:16:46
 * 邮箱：18510971680@163.com
 * 说明：
 */
public class TranficCalculator {
    CalculateStragety stragety;
    public TranficCalculator(){

    }

    public void setStragety(CalculateStragety stragety) {
        this.stragety = stragety;
    }
    public int calculatePrice(int km){
        return stragety.calculatePrice(km);
    }
}
