package com.design.pattern.builderdemo;

/**
 * 作者：zhouliang
 * 时间：2017/10/27:10:48
 * 邮箱：18510971680@163.com
 * 说明：抽象产品类
 */
public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected Computer() {

    }

    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public void setmOS(String mOS) {
        this.mOS = mOS;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
