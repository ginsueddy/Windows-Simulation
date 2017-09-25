package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class MyJPanel extends JPanel implements MouseListener, MouseMotionListener{
    private WindowManager windowManager;
    private Window selectedWindow;
    private int x1Displacement;
    private int y1Displacement;

    public MyJPanel() {
        windowManager = new WindowManager();
        for(int i = 0; i < 10; i++){
            windowManager.addWindow(i);
        }

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        windowManager.drawWindows(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println(x + " , "  + y);
        selectedWindow = windowManager.findWindowByPosition(x, y);
        windowManager.bringToFront(selectedWindow);
        x1Displacement = x - selectedWindow.getX();
        y1Displacement = y - selectedWindow.getY();
        repaint();

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }


    @Override
    public void mouseDragged(MouseEvent e) {// Had Sam help me with the drag component
        int x = e.getX();
        int y = e.getY();
        windowManager.changeWindowCoordinates(x, y, x1Displacement, y1Displacement);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }


}
