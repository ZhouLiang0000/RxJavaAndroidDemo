package com.design.pattern.builderDemo;

/**
 * 作者：zhouliang
 * 时间：2017/10/27:10:52
 * 邮箱：18510971680@163.com
 * 说明：抽象Builder类
 */
public abstract class Builder {
    public abstract void buildBoard(String board);
    public abstract void buildDisplay(String display);
    public abstract void buildOs(String os);
    public abstract Computer create();
}
