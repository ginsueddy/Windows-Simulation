package com.company;

public class Window implements Comparable<Window>{
    private int xCor;
    private int yCor;
    private int zOrder;
    private int width;
    private int height;
    //add color later

    public Window (int xCor, int yCor, int zOrder, int width, int height){
        this.xCor = xCor;
        this.yCor = yCor;
        this.zOrder = zOrder;
        this.width = width;
        this.height = height;
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

    public void drawWindow(){

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
