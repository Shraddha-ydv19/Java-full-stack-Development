package com.college;
// import javax.swing.*;
import java.awt.*;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class StudentSearch {
    public StudentSearch(){
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
            b.setBounds(70, 120,100,30);
            b.setBackground(Color.BLUE);
            b.setForeground(Color.WHITE);
            f.add(b);

             JButton b2=new JButton("Upload");
            b2.setBounds(200, 120,100,30);
            b2.setBackground(Color.BLUE);
            b2.setForeground(Color.WHITE);
            f.add(b2);
            
            b2.addActionListener(e ->{
                try{
                    //Load the Driver...
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    //Create Connection....
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "Shraddha@19");
                    //String Query
                    String sql="Select *from teacher";
                    PreparedStatement pstmt=con.prepareStatement(sql);
                    ResultSet rs=pstmt.executeQuery();

                }
                catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
            });

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
