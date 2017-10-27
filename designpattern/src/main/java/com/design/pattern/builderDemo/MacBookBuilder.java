package com.design.pattern.builderDemo;

/**
 * 作者：zhouliang
 * 时间：2017/10/27:11:38
 * 邮箱：18510971680@163.com
 * 说明：具体实体类
 */
public class MacBookBuilder extends Builder{
    private Computer mComputer = new MacBook();
    @Override
    public void buildBoard(String board) {
        mComputer.setmBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setmDisplay(display);
    }

    @Override
    public void buildOs(String os) {
        mComputer.setmOS(os);
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
