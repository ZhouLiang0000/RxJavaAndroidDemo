package com.design.pattern.stragetyDemo;

/**
 * 作者：zhouliang
 * 时间：2017/10/30:16:32
 * 邮箱：18510971680@163.com
 * 说明：公交车计算价格类，10公里内一元，超过之后，每5公里添加一元
 */
public class BusStragety implements CalculateStragety{

    @Override
    public int calculatePrice(int km) {
        //超过10公里的路程
        int extraTotal = km - 10;
        //超过的距离是5的几倍
        int extraFactor = extraTotal / 5;
        //超过的距离对5取余数
        int fraction = extraFactor % 5;
        //价格计算
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }
}
