package com.company;

import java.util.ArrayList;

public class WindowManager {

    private ArrayList<Window> windows = new ArrayList<Window>();

    public WindowManager(ArrayList<Window> windows){
        this.windows = windows;
    }

    public void addWindow(int zOrder){
        Window window = new Window(500, 400, zOrder, 100, 100);
        this.windows.add(zOrder, window);

    }

    public void drawWindows(){

    }

    public void bringToFront(){

    }

    public void findWindowByPosition(){

    }

    public ArrayList<Window> getWindows() {
        return windows;
    }
}
