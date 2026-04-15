package com.college;
import javax.swing.*;
import java.awt.*;

public class AddStudent {
    public AddStudent(){
        JFrame f=new JFrame("Student Details");
        f.setSize(400,400);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.BLACK);

        JLabel l=new JLabel("Add Student");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setBounds(30, 20, 300, 30);

        l.setForeground(Color.WHITE);
        l.setFont(new Font("Italic", Font.BOLD, 26));
        f.add(l); // Add the label to the frame


        JLabel l1=new JLabel("Name");
        l1.setBounds(50, 80, 100, 30);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Arial", Font.BOLD, 14));
        f.add(l1); // Add the label to the frame


        JTextField t1=new JTextField();
        t1.setBounds(150, 80, 150, 30);
        f.add(t1);


        JLabel l2=new JLabel("Class");
        l2.setBounds(50, 130, 100, 30);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Arial", Font.BOLD, 14));
        f.add(l2); // Add the label to the frame
        JTextField t2=new JTextField();
        t2.setBounds(150, 130, 150, 30);
        f.add(t2);

         JLabel l3=new JLabel("Roll Number");
        l3.setBounds(50, 180, 100, 30);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Arial", Font.BOLD, 14));
        f.add(l3); // Add the label to the frame
        JTextField t3=new JTextField();
        t3.setBounds(150, 180, 150, 30);
        f.add(t3);

        JButton b1=new JButton("Add");
        b1.setBounds(150, 230,100,30);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        f.add(b1);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close button fix
        f.setVisible(true); // ⭐ MOST IMPORTANT

    }
}
