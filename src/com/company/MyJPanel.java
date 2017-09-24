package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyJPanel extends JPanel implements MouseListener, MouseMotionListener{
    private WindowManager windowManager;

    public MyJPanel() {
        windowManager = new WindowManager();
        for(int i = 0; i < 10; i++){
            windowManager.addWindow(i);
        }

        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println(x + " , "  + y);
        windowManager.findWindowByPosition(x, y);
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }


    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        windowManager.drawWindows(g);
    }

}
