package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botones
{
    static int i = 0;
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Button Example");
        JLabel l = new JLabel("Número = " + i);
        JButton b = new JButton("Click para sumar 1");
        JButton b2 = new JButton("Click para restar 1");
        JButton b3 = new JButton("Click para duplicar");
        JButton b4 = new JButton("Click para dividir");

        l.setBounds(160, 160, 100, 50);
        b.setBounds(30, 40,150, 100);
        b2.setBounds(210, 40,150, 100);
        b3.setBounds(30, 225,150, 100);
        b4.setBounds(210, 225, 150, 100);

        f.add(l);
        f.add(b);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        botones(b, b2, b3, b4, l);

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(400,400);
        f.setResizable(false);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void botones (JButton b, JButton b2, JButton b3, JButton b4, JLabel l)
    {
        b.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                l.setText("Número = " + ++i);
            }
        });
        b2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                l.setText("Número = " + --i);
            }
        });
        b3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                i *= 2;
                l.setText("Número = " + i);
            }
        });
        b4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                i /= 2;
                l.setText("Número = " + i);
            }
        });
    }
}
