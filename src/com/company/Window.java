package com.company;

import java.awt.*;

public class Window implements Comparable<Window>{
    private int x1;
    private int y1;
    private int zOrder;
    private int width;
    private int height;
    private Color color;
    private int x2;
    private int y2;

    public Window (int x1, int y1, int zOrder, int width, int height, Color color){
        this.x1 = x1;
        this.y1 = y1;
        this.zOrder = zOrder;
        this.width = width;
        this.height = height;
        this.color = color;
        x2 = x1 + width;
        y2 = y1 + height;
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
        g.fillRect(x1, y1, width, height);
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setzOrder(int zOrder) {
        this.zOrder = zOrder;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getzOrder() {
        return zOrder;
    }
}
