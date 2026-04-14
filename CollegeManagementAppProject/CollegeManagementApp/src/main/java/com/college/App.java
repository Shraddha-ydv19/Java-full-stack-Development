package com.college;
import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {

        JFrame f = new JFrame("College Management System");

        f.setSize(400, 400);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.BLACK);
        

        JLabel l= new JLabel("College Management System");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setBounds(30, 20, 300, 30);
        l.setForeground(Color.WHITE);
        l.setFont(new Font("Arial", Font.BOLD, 16));
        f.add(l); // Add the label to the frame

        JLabel l1=new JLabel("Welcome");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setBounds(30, 50, 300, 30);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Arial", Font.BOLD, 16));
        f.add(l1); // Add the label to the frame

        JButton b1=new JButton("Admin");
        b1.setBounds(50, 200,100,30);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        f.add(b1);

        JButton b2=new JButton("User");
        b2.setBounds(220, 200,100,30);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        f.add(b2);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close button fix
        f.setVisible(true); // ⭐ MOST IMPORTANT
    }
}