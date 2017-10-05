package com.sabel;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class LayoutManager extends JFrame {

    // DATAFIELDS
    private JPanel center;
    private JPanel north;
    private JPanel south;
    private JPanel west;
    private JPanel east;


    public LayoutManager() {
        this.setTitle("BorderLayout");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.initComponents();
        this.setVisible(true);
    } // END LayoutManager()

    private void initComponents() {
        // JPanels
        center = new JPanel();
        north = new JPanel();
        south = new JPanel();
        west = new JPanel();
        east = new JPanel();

        // Labels
        JLabel jCenter = new JLabel("Center");
        JLabel jNorth = new JLabel("North");
        JLabel jSouth = new JLabel("South");
        JLabel jWest = new JLabel("West");
        JLabel jEast = new JLabel("East");

        // Border
        Border borderCenter = center.getBorder();
        Border borderNorth = north.getBorder();
        Border borderSouth = south.getBorder();
        Border borderWest = west.getBorder();
        Border borderEast = east.getBorder();
        Border margin = new LineBorder(Color.gray, 2);
        center.setBorder(new CompoundBorder(borderCenter, margin));
        north.setBorder(new CompoundBorder(borderNorth, margin));
        south.setBorder(new CompoundBorder(borderSouth, margin));
        west.setBorder(new CompoundBorder(borderWest, margin));
        east.setBorder(new CompoundBorder(borderEast, margin));

        // Labels hinzufügen
        center.add(jCenter);
        north.add(jNorth);
        south.add(jSouth);
        west.add(jWest);
        east.add(jEast);

        // JPanels hinzufügen
        this.add(center, BorderLayout.CENTER);
        this.add(north, BorderLayout.NORTH);
        this.add(south, BorderLayout.SOUTH);
        this.add(west, BorderLayout.WEST);
        this.add(east, BorderLayout.EAST);

    } // END void initComponents()


} // END class LayoutManager extends JFrame
