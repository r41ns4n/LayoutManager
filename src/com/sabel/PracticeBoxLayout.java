package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PracticeBoxLayout extends JFrame {

    private JPanel jPanelRadioButtons, jPanleButtons, jPanelColor;
    private JButton jButtonRed, jButtonGreen, jButtonBlue;
    private JLabel jButtonLabelRed, jButtonLabelGreen, jButtonLabelBlue;
    private JRadioButton jRadioButtonRed, jRadioButtonGreen, jRadioButtonBlue;
    private ButtonGroup buttonGroup;

    public PracticeBoxLayout() {
        super("Übung Layout");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.initComponents();
        this.initEvents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    } // END PracticeBoxLayout()

    private void initEvents() {
        MeinMouseListener mouseListenerRed = new MeinMouseListener();
        MeinMouseListener mouseListenerGreen = new MeinMouseListener();
        MeinMouseListener mouseListenerBlue = new MeinMouseListener();
        jButtonRed.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanelColor.setBackground(new Color(255, 0, 0));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        jButtonGreen.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanelColor.setBackground(new Color(0, 255, 0));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        jButtonBlue.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanelColor.setBackground(new Color(0, 0, 255));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        jRadioButtonRed.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanelColor.setBackground(new Color(255, 0, 0));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        jRadioButtonGreen.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanelColor.setBackground(new Color(0, 255, 0));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        jRadioButtonBlue.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jPanelColor.setBackground(new Color(0, 0, 255));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    } // END void initEvents()

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

        // ADD BUTTONGROUP TO JPANEL
        jPanelRadioButtons.add(jRadioButtonRed);
        jPanelRadioButtons.add(jRadioButtonGreen);
        jPanelRadioButtons.add(jRadioButtonBlue);

        // ADD PANLE TO FRAME
        this.add(jPanelRadioButtons, BorderLayout.WEST);
        this.add(jPanleButtons, BorderLayout.SOUTH);
        this.add(jPanelColor);

    } // END void initComponents()

    // INNERCLASS
    private class MeinMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            jPanelColor.setBackground(new Color(0, 0, 255));
        } // END void mouseExited(MouseEvent e)

    } // END INNERCLASS MeinMouseListener extends MouseAdapter


} // END class PracticeBoxLayout
