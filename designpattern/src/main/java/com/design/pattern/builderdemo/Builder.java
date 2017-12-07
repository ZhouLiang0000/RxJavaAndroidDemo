package com.design.pattern.builderdemo;

/**
 * 作者：zhouliang
 * 时间：2017/10/27:10:52
 * 邮箱：18510971680@163.com
 * 说明：抽象Builder类
 */
public abstract class Builder {
    public abstract Builder setBoard(String board);
    public abstract Builder setDisplay(String display);
    public abstract Builder setOs(String os);
    public abstract Computer create();
}
