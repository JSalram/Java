package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Basico
{

    public static void main(String[] args)
    {
        final int[] i = {0};

        JFrame ventana = new JFrame("Prueba JFrame");
        JPanel panel = new JPanel(new FlowLayout());
        JLabel label = new JLabel("Hola Mundo!");
        JLabel cont = new JLabel();
        JButton button = new JButton("Click aquí");

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                cont.setText(Integer.toString((i[0]++)));
            }
        });

        panel.add(label);
        panel.add(button);
        panel.add(cont);
        ventana.add(panel);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(true);
        ventana.setVisible(true);
    }
}
