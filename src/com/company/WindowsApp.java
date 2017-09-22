package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowsApp{
    private JButton addWindowButton;
    private JPanel panelMain;

    public WindowsApp() {
        addWindowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Window Added");

            }
        });
    }

    public JPanel getPanelMain (){
        return panelMain;
    }
}
