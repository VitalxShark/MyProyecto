package com.mycompany.vitaliihavrangui.git;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VitaliiHavranGUIGIT extends JFrame { 
    public VitaliiHavranGUIGIT() { 
        JLabel lblSaludo = new JLabel("Hola Mundo.");
        JLabel lblSaludo2 = new JLabel("¿Qué tal estás?");
        JLabel lblSaludo3 = new JLabel("¡Bienvenidos!");
        JLabel lblSaludo4 = new JLabel("¡Bienvenido a RAMA1!"); // El nuevo saludo añadido

        lblSaludo.setBounds(2, 28, 116, 24); 
        lblSaludo2.setBounds(2, 50, 116, 24); 
        lblSaludo3.setBounds(2, 72, 116, 24); 
        lblSaludo4.setBounds(2, 94, 160, 24); // Posición de la nueva etiqueta

        this.setLayout(null); 
        this.add(lblSaludo);
        this.add(lblSaludo2);
        this.add(lblSaludo3);
        this.add(lblSaludo4); // Añadir la nueva etiqueta a la ventana

        this.setSize(400, 300);
        this.setTitle("JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new VitaliiHavranGUIGIT(); 
    }
}
