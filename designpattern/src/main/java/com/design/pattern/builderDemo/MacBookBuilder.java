package com.design.pattern.builderDemo;

/**
 * 作者：zhouliang
 * 时间：2017/10/27:11:38
 * 邮箱：18510971680@163.com
 * 说明：具体实体类
 */
public class MacBookBuilder extends Builder{
    private Computer mComputer = new MacBook();
    private String board;
    private String display;
    private String os;
    @Override
    public MacBookBuilder setBoard(String board) {
        this.board = board;
        return this;
    }

    @Override
    public MacBookBuilder setDisplay(String display) {
        this.display = display;
        return this;
    }

    @Override
    public MacBookBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    @Override
    public Computer create() {
        mComputer.setmBoard(board);
        mComputer.setmDisplay(display);
        mComputer.setmOS(os);
        return mComputer;
    }
}
