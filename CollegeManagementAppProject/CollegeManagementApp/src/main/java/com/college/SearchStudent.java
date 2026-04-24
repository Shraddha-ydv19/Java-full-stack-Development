package com.college;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
public class SearchStudent {
    public SearchStudent(){
            JFrame f=new JFrame("Search Student");
            f.setSize(400,400);
            f.setLayout(null);
            f.getContentPane().setBackground(Color.BLACK);
            JLabel l=new JLabel("Enter Roll Number");
            l.setHorizontalAlignment(JLabel.CENTER);
            l.setBounds(30, 20, 300, 30);
            l.setForeground(Color.WHITE);
            l.setFont(new Font("Arial", Font.BOLD, 16));
            f.add(l); // Add the label to the frame
            JTextField t=new JTextField();
            t.setBounds(100, 70, 200, 30);
            f.add(t);
            
            JButton b=new JButton("Search");
            b.setBounds(150, 120,100,30);
            b.setBackground(Color.BLUE);
            b.setForeground(Color.WHITE);
            f.add(b);
 
               JButton b2=new JButton("Upload");
            b2.setBounds(190, 120,100,30);
            b2.setBackground(Color.BLUE);
            b2.setForeground(Color.WHITE);
            f.add(b2);

               
String[] columns = {"Name", "Class", "Roll Number"};



DefaultTableModel model = new DefaultTableModel(columns, 0);

JTable table = new JTable(model);
//model.addRow(new Object[]{"Shraddha", "BTech", "100"});


JScrollPane sp = new JScrollPane(table);
sp.setBounds(50, 200, 300, 120);
f.add(sp);


            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
    }
}
