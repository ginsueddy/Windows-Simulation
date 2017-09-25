package com.company;

import java.awt.*;

public class Window implements Comparable<Window>{
    private int x;
    private int y;
    private int zOrder;
    private int width;
    private int height;
    private Color color;

    public Window (int x, int y, int zOrder, int width, int height, Color color){
        this.x = x;
        this.y = y;
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
        g.fillRect(x, y, width, height);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setzOrder(int zOrder) {
        this.zOrder = zOrder;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getzOrder() {
        return zOrder;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
