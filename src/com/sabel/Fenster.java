package com.sabel;

import javax.swing.*;
import java.awt.*;

public class Fenster extends JFrame {

    private MeinJPanel jPanelNorth, jPanelWest, jPanelSouth, jPanelEast, jPanelCenter;
    private JPanel jPanelFlowPanel;

    public Fenster() {
        super("LayoutManager");
        this.setSize(400,400);
        this.initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    } // END Fenster()

    private void initComponents() {
        // GENERATE JPANELS
        jPanelNorth = new MeinJPanel("North");
        jPanelWest = new MeinJPanel("West");
        jPanelSouth = new MeinJPanel("South");
        jPanelEast = new MeinJPanel("East");
        jPanelCenter = new MeinJPanel("Center");

        // GENERATE NEW JPANEL WITH FLOWLAYOUT
        jPanelFlowPanel = new JPanel();
        jPanelFlowPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30,50));
        for(int i = 0; i < 5; i++) {
            jPanelFlowPanel.add(new JLabel("Text" + (i + 1)));
        } // END jPanelFlowPanel

        // ADD PANEL TO FRAME
        this.add(jPanelNorth, BorderLayout.NORTH);
        this.add(jPanelWest, BorderLayout.WEST);
        this.add(jPanelSouth, BorderLayout.SOUTH);
        this.add(jPanelEast, BorderLayout.EAST);
        this.add(jPanelCenter);
        this.add(jPanelFlowPanel);
    } // END void initComponents()

} // END class Fenster extends JFrame
