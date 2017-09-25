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

    public void bringToFront(Window selectedWindow){
        for(int i = 0; i < windows.size(); i++){
            if(selectedWindow.getzOrder() == windows.get(i).getzOrder()){
                windows.remove(windows.get(i));
                windows.add(selectedWindow);
                for(int j = 0; j < windows.size(); j++){
                    windows.get(j).setzOrder(j);
                }
            }
        }

    }

    public Window findWindowByPosition(int mouseX, int mouseY){
        ArrayList<Window> windowsAtPosition = new ArrayList<Window>();
        Window selectedWindow = windows.get(windows.size()-1);

        for(int i = 0; i < windows.size(); i++){
            Window window = windows.get(i);
            int x2 = window.getX() + window.getWidth();
            int y2 = window.getY() + window.getHeight();
            if(window.getX() <= mouseX && mouseX <= x2 && window.getY() <= mouseY && mouseY <= y2){
                windowsAtPosition.add(window);
            }
        }
        if(windowsAtPosition.size() > 1) {
            for(int i = 0; i < windowsAtPosition.size() - 1; i++){
                if(windowsAtPosition.get(i).compareTo(windowsAtPosition.get(i+1)) == 1){
                    selectedWindow = windowsAtPosition.get(i);
                }
            }
        }
        else if(windowsAtPosition.size() == 1){
            selectedWindow = windowsAtPosition.get(0);
        }
        return selectedWindow;
    }

    public void changeWindowCoordinates(int x, int y, int xDisplacement, int yDisplacement){
        Window selectedWindow = windows.get(windows.size() - 1);
        int changeX1 = x - xDisplacement;
        int changeY1 = y - yDisplacement;

        selectedWindow.setX(changeX1);
        selectedWindow.setY(changeY1);
    }

    public ArrayList<Window> getWindows() {
        return windows;
    }
}
