package com.design.pattern.stragetydemo;

/**
 * 作者：zhouliang
 * 时间：2017/10/30:16:40
 * 邮箱：18510971680@163.com
 * 说明：地铁计算价格类，6公里内(含)3元，6到12公里(含)4元，12到22公里(含)5元，22到32公里(含)6元，其他7元
 */
public class SubwayStragety implements CalculateStragety{
    @Override
    public int calculatePrice(int km) {
        if(km <= 6){
            return 3;
        }else if(6 < km && km <= 12){
            return 4;
        }else if(12 < km && km <= 22){
            return 5;
        }else if(22 < km && km <= 32){
            return 6;
        }
        return 7;
    }
}
