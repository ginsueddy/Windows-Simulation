package com.company;

import java.util.ArrayList;

public class WindowManager {

    private ArrayList<Window> windows = new ArrayList<Window>();

    public WindowManager(ArrayList<Window> windows){
        this.windows = windows;
        addWindow(windows);
    }

    public void addWindow(ArrayList<Window> windows){
        Window window = new Window(500, 400, 0);
        windows.add(0, window);

    }

    public void drawWindows(){

    }

    public void bringToFront(){

    }

    public void findWindow(){

    }

    public ArrayList<Window> getWindows() {
        return windows;
    }
}
