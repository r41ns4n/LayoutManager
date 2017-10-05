package com.sabel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MeinJPanel extends JPanel {

    private JLabel jLabel;

    public MeinJPanel(String text) {
        this.jLabel = new JLabel(text);
        // this.jLabel.setText(text);
        this.setBorder(new TitledBorder(""));
        initEvents();
        this.add(jLabel);
    } // END JLabel jLabel()

    private void getZufallsfarbe() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        this.setBackground(new Color(r, g, b));
        System.out.println("Rot: " + r + ", Grün: " + g + ", Blau: " + b);
    } // END getZufallsfarbe()

    public void initEvents() {
        MeinMouseListener mml = new MeinMouseListener();
        this.addMouseListener(mml);
    } // END initEvents()


    private class MeinMouseListener extends MouseAdapter{
            @Override
            public void mouseEntered(MouseEvent e) {
                getZufallsfarbe();
            } // END void mouseExited(MouseEvent e)

            @Override
            public void mouseExited(MouseEvent e) {
                getZufallsfarbe();
            } // END void mouseExited(MouseEvent e)
        }
} // END class JPanel extends javax.swing.JPanel


