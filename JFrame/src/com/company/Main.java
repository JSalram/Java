package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Frame Demo");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Label label = new Label();
        ventana.getContentPane().add(label, BorderLayout.CENTER);

        ventana.setSize(700, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setVisible(true);

        JFrame.setDefaultLookAndFeelDecorated(true);
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        ventana.add(panel);
    }
}
