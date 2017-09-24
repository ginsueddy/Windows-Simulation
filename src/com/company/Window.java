package com.company;

import java.awt.*;

public class Window implements Comparable<Window>{
    private int xCor;
    private int yCor;
    private int zOrder;
    private int width;
    private int height;
    private Color color;

    public Window (int xCor, int yCor, int zOrder, int width, int height, Color color){
        this.xCor = xCor;
        this.yCor = yCor;
        this.zOrder = zOrder;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public int compareTo(Window o) {
        if(zOrder > o.getzOrder()){
            return 1;
        }
        else if(zOrder < o.getzOrder()){
            return -1;
        }
        else {
            return 0;
        }
    }

    public void drawWindow(Graphics g){
        g.setColor(color);
        g.fillRect(xCor, yCor, width, height);
    }

    public void setxCor(int xCor) {
        this.xCor = xCor;
    }

    public void setyCor(int yCor) {
        this.yCor = yCor;
    }

    public void setzOrder(int zOrder) {
        this.zOrder = zOrder;
    }

    public int getxCor() {
        return xCor;
    }

    public int getyCor() {
        return yCor;
    }

    public int getzOrder() {
        return zOrder;
    }
}
