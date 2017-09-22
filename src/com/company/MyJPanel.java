package com.company;

import javax.swing.*;
import java.awt.*;


public class MyJPanel extends JPanel{
    private JPanel panelMain;

    public MyJPanel() {
        WindowManager windowManager = new WindowManager();
        for(int i = 0; i < 10; i++){
            windowManager.addWindow(i);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public JPanel getPanelMain (){
        return panelMain;
    }
}
