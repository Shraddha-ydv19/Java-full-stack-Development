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
        l.setBounds(50, 50, 300, 30);
        l.setForeground(Color.WHITE);
        l.setFont(new Font("Arial", Font.BOLD, 16));
        f.add(l); // Add the label to the frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close button fix
        f.setVisible(true); // ⭐ MOST IMPORTANT
    }
}