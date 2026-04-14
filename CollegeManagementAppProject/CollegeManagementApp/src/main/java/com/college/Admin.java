package com.college;
import javax.swing.*;
import java.awt.*;

public class Admin {
    public static void main(String[] args){
        JFrame f=new JFrame("Admin Login");
        f.setSize(400,400);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.BLACK);
        JLabel l=new JLabel("Which operation do you want to perform?");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setBounds(30, 20, 300, 30);
        l.setForeground(Color.WHITE);
        l.setFont(new Font("Arial", Font.BOLD, 16));
        f.add(l);

        JButton b1=new JButton("Add Student");
        b1.setBounds(50, 100,100,30);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        f.add(b1);

        JButton b2=new JButton("Delete Student");
        b2.setBounds(220, 100,100,30);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        f.add(b2);

         JButton b3=new JButton("Update Student");
        b3.setBounds(50, 170,100,30);
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);
        f.add(b3);

         JButton b4=new JButton("Search Student");
        b4.setBounds(220, 170,100,30);
        b4.setBackground(Color.BLUE);
        b4.setForeground(Color.WHITE);
        f.add(b4);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
