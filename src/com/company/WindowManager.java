package com.company;

import java.awt.*;
import java.util.*;

public class WindowManager {

    private ArrayList<Window> windows;

    public WindowManager(){
        windows = new ArrayList<Window>();
    }

    public void addWindow(int zOrder){
        Random rand = new Random ();

        int xCor = rand.nextInt(1000);
        int yCor = rand.nextInt(600);
        int width = rand.nextInt(300) + 50;
        int height = rand.nextInt(300) + 50;
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);

        Window window = new Window(xCor, yCor, zOrder, width, height, new Color(r, g, b));
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

    public Window findWindowByPosition(int mouseX, int mouseY){
        ArrayList<Window> windowsAtPosition = new ArrayList<Window>();
        Window selectedWindow = windows.get(0);

        for(int i = 0; i < windows.size(); i++){
            Window window = windows.get(i);
            if(window.getX1() <= mouseX && mouseX <= window.getX2() && window.getY1() <= mouseY && mouseY <= window.getY2()){
                windowsAtPosition.add(window);
            }
        }
        System.out.println(windowsAtPosition.size());
        if(windowsAtPosition.size() > 1) {
            for(int i = 0; i < windowsAtPosition.size() - 1; i++){
                if(windowsAtPosition.get(i).compareTo(windowsAtPosition.get(i+1)) == 1){
                    selectedWindow = windowsAtPosition.get(i);
                }
            }
        }
        else{
            selectedWindow = windowsAtPosition.get(0);
        }
        return selectedWindow;
    }

    public ArrayList<Window> getWindows() {
        return windows;
    }
}
