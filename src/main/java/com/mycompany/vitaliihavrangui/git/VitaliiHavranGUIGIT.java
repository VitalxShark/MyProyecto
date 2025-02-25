package com.mycompany.vitaliihavrangui.git;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VitaliiHavranGUIGIT extends JFrame { 
    public VitaliiHavranGUIGIT() { 
        JLabel lblSaludo = new JLabel("Hola Mundo.");
        lblSaludo.setBounds(50, 50, 100, 30); 

        this.setLayout(null); 
        this.add(lblSaludo);
        
        this.setSize(400, 300);
        this.setTitle("JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new VitaliiHavranGUIGIT(); 
    }
}

