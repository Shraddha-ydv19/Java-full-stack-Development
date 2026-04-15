package com.college;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;


public class UpdateStudent {
    public UpdateStudent(){
            JFrame f=new JFrame("Update Student");
            f.setSize(500,600);
            f.setLayout(null);
            f.getContentPane().setBackground(Color.BLACK);
            JLabel l=new JLabel("Update Student Details");
            l.setHorizontalAlignment(JLabel.CENTER);
            l.setBounds(30, 20, 300, 30);
            l.setForeground(Color.WHITE);
            l.setFont(new Font("Arial", Font.BOLD, 16));
            f.add(l); // Add the label to the frame
            
            JLabel l1=new JLabel("Old Roll Number");
            l1.setBounds(30, 70, 120, 30);
            l1.setForeground(Color.WHITE);

            JTextField t1=new JTextField();
            t1.setBounds(150, 70, 200, 30);
            f.add(l1);
            f.add(t1);
            
            JLabel l2=new JLabel("New Name");
            l2.setBounds(30, 120, 120, 30);
            l2.setForeground(Color.WHITE);
            JTextField t2=new JTextField();
            t2.setBounds(150, 120, 200, 30);
            f.add(l2);
            f.add(t2);

            JLabel l3=new JLabel("New Class");
            l3.setBounds(30, 170, 120, 30);
            l3.setForeground(Color.WHITE);
            JTextField t3=new JTextField();
            t3.setBounds(150, 170, 200, 30);
            f.add(l3);
            f.add(t3);

            JLabel l4=new JLabel("New Roll Number");
            l4.setBounds(30, 220, 120, 30);
            l4.setForeground(Color.WHITE);
            f.add(l4);
            JTextField t4=new JTextField();
            t4.setBounds(150, 220, 200, 30);
            f.add(t4);

            JButton b=new JButton("Update");
            b.setBounds(150, 270,100,30);
            b.setBackground(Color.BLUE);
            b.setForeground(Color.WHITE);
            f.add(b);

            JTable table = new JTable();
            JScrollPane sp = new JScrollPane(table);
            sp.setBounds(50, 320, 300, 120);
            f.add(sp);

             // Table columns   
String[] columns = {"Name", "Class", "Roll Number"};

// Table model
DefaultTableModel model = new DefaultTableModel(columns, 0);
// JTable with model
table.setModel(model);


            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
    }
}
