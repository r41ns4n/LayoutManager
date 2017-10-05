package com.sabel;

import javax.swing.*;

public class JPanel extends javax.swing.JPanel{

    private JLabel jLabel;

         public JPanel (String text) {
        this.jLabel = new JLabel(text);
        // this.jLabel.setText(text);
        this.add(jLabel);
    } // END JLabel jLabel()

} // END class JPanel extends javax.swing.JPanel
