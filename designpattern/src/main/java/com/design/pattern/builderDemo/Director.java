package com.design.pattern.builderDemo;

/**
 * 作者：zhouliang
 * 时间：2017/10/27:11:40
 * 邮箱：18510971680@163.com
 * 说明：builder实现链式调用简化调了这个类
 */
public class Director {
    Builder mBuilder = null;
    public Director(Builder builder){
        mBuilder = builder;
    }
    public void construct(String board,String display,String os){
        mBuilder.setBoard(board);
        mBuilder.setDisplay(display);
        mBuilder.setOs(os);
    }
}
