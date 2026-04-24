package com.college;
import javax.swing.*;
import java.awt.*;

public class Login {
    public static void main(String[] args){
        JFrame f=new JFrame("LOGIN");
        f.setSize(400,400);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.BLACK);
        JLabel l=new JLabel("Login");
        l.setHorizontalAlignment(JLabel.CENTER);



        l.setBounds(30, 20, 300, 30);
        l.setForeground(Color.WHITE);
        l.setFont(new Font("Arial", Font.BOLD, 16));
        f.add(l); // Add the label to the frame
        JLabel l1=new JLabel("Username");
        l1.setBounds(50, 80, 100, 30);
        l1.setForeground(Color.WHITE);

        l1.setFont(new Font("Arial", Font.BOLD, 14));
        f.add(l1); // Add the label to the frame

        JTextField t1=new JTextField();
        t1.setBounds(150, 80, 150, 30);
        f.add(t1);
        
        JLabel l2=new JLabel("Password");
        l2.setBounds(50, 130, 100, 30); 
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Arial", Font.BOLD, 14));
        f.add(l2); 
        JPasswordField t2=new JPasswordField();
        t2.setBounds(150, 130, 150, 30);
        f.add(t2);
        JButton b1=new JButton("Login");
        b1.setBounds(150, 200,100,30);

        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        f.add(b1);
        

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setVisible(true); 

    }
}
