package com.sabel;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PracticeBoxLayout extends JFrame {

    private JPanel jPanelRadioButtons, jPanleButtons, jPanelColor, jPanelComboBox;
    private JButton jButtonRed, jButtonGreen, jButtonBlue;
    private JLabel jButtonLabelRed, jButtonLabelGreen, jButtonLabelBlue;
    private JRadioButton jRadioButtonRed, jRadioButtonGreen, jRadioButtonBlue;
    private JComboBox<String> jComboBox;
    private ButtonGroup buttonGroup;

    public PracticeBoxLayout() {
        super("Übung Layout");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.initComponents();
        this.initJComboBox();
        this.initEvents();
        this.setLocationRelativeTo(null);
        //this.pack();
        this.setVisible(true);
    } // END PracticeBoxLayout()

    private void initJComboBox() {
        String[] items = new String[]{"Red", "Green", "Blue"};
        jComboBox = new JComboBox<>(items);
        jPanelComboBox.add(jComboBox);
    } // END void initJComboBox()

    private void initComponents() {
        // GENERATE BUTTONS
        jButtonRed = new JButton();
        jButtonGreen = new JButton();
        jButtonBlue = new JButton();

        // GENERATE JPANEL
        jPanelRadioButtons = new JPanel();
        this.jPanelRadioButtons.setLayout(new BoxLayout(jPanelRadioButtons, BoxLayout.Y_AXIS));
        jPanleButtons = new JPanel();
        jPanelColor = new JPanel();
        this.jPanelColor.setBackground(new Color(255, 0, 0));
        jPanelComboBox = new JPanel();

        // GENERATE JLABELS
        jButtonLabelRed = new JLabel("Red");
        jButtonLabelGreen = new JLabel("Green");
        jButtonLabelBlue = new JLabel("Blue");

        // GENERATE RADIOBUTTONS - BUTTONGROUP
        jRadioButtonRed = new JRadioButton("Red");
        jRadioButtonGreen = new JRadioButton("Green");
        jRadioButtonBlue = new JRadioButton("Blue");
        buttonGroup = new ButtonGroup();

        // ADD BUTTONS TO BUTTONGROUP
        buttonGroup.add(jRadioButtonRed);
        buttonGroup.add(jRadioButtonGreen);
        buttonGroup.add(jRadioButtonBlue);

        // ADD LABEL TO BUTTONS
        jButtonRed.add(jButtonLabelRed);
        jButtonGreen.add(jButtonLabelGreen);
        jButtonBlue.add(jButtonLabelBlue);

        // ADD BUTTONS TO JPANEL
        jPanleButtons.add(jButtonRed);
        jPanleButtons.add(jButtonGreen);
        jPanleButtons.add(jButtonBlue);

        // ACTIVATE BUTTON RED
        jRadioButtonRed.setSelected(true);

        // ADD BUTTONGROUP TO JPANEL
        jPanelRadioButtons.add(jRadioButtonRed);
        jPanelRadioButtons.add(jRadioButtonGreen);
        jPanelRadioButtons.add(jRadioButtonBlue);

        // ADD PANLE TO FRAME
        this.add(jPanelComboBox, BorderLayout.NORTH);
        this.add(jPanelRadioButtons, BorderLayout.WEST);
        this.add(jPanleButtons, BorderLayout.SOUTH);
        this.add(jPanelColor);

    } // END void initComponents()


    private void initEvents() {

        this.jButtonRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                red();
            }
        });

        this.jRadioButtonRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                red();
            }
        });

        this.jButtonBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blue();
            }
        });

        this.jRadioButtonBlue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blue();
            }
        });

        this.jButtonGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                green();
            }
        });

        this.jRadioButtonGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                green();
            }
        });

        this.jComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
                switch ((String) jComboBox.getSelectedItem()) {
                    case "Red":
                        red();
                        break;
                    case "Green":
                        green();
                        break;
                    case "Blue":
                        blue();
                        break;
                }
            }
        });

    } // END void initEvents()

    private void red() {
        jPanelColor.setBackground(Color.RED);
        jRadioButtonRed.setSelected(true);
        jComboBox.setSelectedItem("Red");
    } // END void red()

    private void blue() {
        jPanelColor.setBackground(Color.BLUE);
        jRadioButtonBlue.setSelected(true);
        jComboBox.setSelectedItem("Blue");
    } // END void red()

    private void green() {
        jPanelColor.setBackground(Color.GREEN);
        jRadioButtonGreen.setSelected(true);
        jComboBox.setSelectedItem("Green");
    } // END void red()


} // END class PracticeBoxLayout
