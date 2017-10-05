package com.sabel;

import javax.swing.*;
import java.awt.*;

public class Fenster extends JFrame {

    private JPanel jPanelNorth, jPanelWest, jPanelSouth, jPanelEast, jPanelCenter;

    public Fenster() {
        super("LayoutManager");
        this.setSize(300,400);
        this.initComponents();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    } // END Fenster()

    private void initComponents() {
        // GENERATE JPANELS
        jPanelNorth = new JPanel("North");
        jPanelWest = new JPanel("West");
        jPanelSouth = new JPanel("South");
        jPanelEast = new JPanel("East");
        jPanelCenter = new JPanel("Center");

        // ADD PANEL TO FRAME
        this.add(jPanelNorth, BorderLayout.NORTH);
        this.add(jPanelWest, BorderLayout.WEST);
        this.add(jPanelSouth, BorderLayout.SOUTH);
        this.add(jPanelEast, BorderLayout.EAST);
        this.add(jPanelCenter);
    } // END void initComponents()

} // END class Fenster extends JFrame
