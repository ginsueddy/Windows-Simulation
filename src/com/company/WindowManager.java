package com.company;

import java.awt.*;
import java.util.ArrayList;

public class WindowManager {

    private ArrayList<Window> windows;

    public WindowManager(){
        windows = new ArrayList<Window>();
    }

    public void addWindow(int zOrder){
        Window window = new Window(500, 400, zOrder, 100, 100);
        this.windows.add(zOrder, window);
    }

    public void drawWindows(Graphics g){
        for(int i = 0; i < windows.size(); i++){
            Window window = windows.get(i);
            window.drawWindow(g);
        }

    }

    public void bringToFront(){

    }

    public void findWindowByPosition(){

    }

    public ArrayList<Window> getWindows() {
        return windows;
    }
}
