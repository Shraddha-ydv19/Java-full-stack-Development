package com.college;
// import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class StudentSearch {
    public static void main(String[] args){
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

                // Table columns
String[] columns = {"Name", "Class", "Roll Number"};


// Table model
DefaultTableModel model = new DefaultTableModel(columns, 0);

// JTable with model
JTable table = new JTable(model);
//model.addRow(new Object[]{"Shraddha", "BTech", "100"});

// Scroll pane (IMPORTANT for table)
JScrollPane sp = new JScrollPane(table);
sp.setBounds(50, 200, 300, 120);
f.add(sp);


            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
    }
}
