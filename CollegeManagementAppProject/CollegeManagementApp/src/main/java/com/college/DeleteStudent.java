package com.college;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class DeleteStudent {
    

 public DeleteStudent(){
        JFrame f=new JFrame("Student Details");
        f.setSize(400,400);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.BLACK);

        JLabel l=new JLabel("Delete Student");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setBounds(30, 20, 300, 30);

        l.setForeground(Color.WHITE);
        l.setFont(new Font("Italic", Font.BOLD, 26));
        f.add(l); // Add the label to the frame


       


       

         JLabel l3=new JLabel("Roll Number");
        l3.setBounds(50, 100, 100, 30);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Arial", Font.BOLD, 14));
        f.add(l3); // Add the label to the frame
        JTextField t3=new JTextField();
        t3.setBounds(150, 100, 150, 30);
        f.add(t3);


          JButton b=new JButton("Search");
        b.setBounds(100, 150,100,30);
        b.setBackground(Color.BLUE);
        b.setForeground(Color.WHITE);
        f.add(b); 

        JButton b1=new JButton("Delete");
        b1.setBounds(250, 150,100,30);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        f.add(b1);

       // Table columns
String[] columns = {"Name", "Class", "Roll Number"};


// Table model
DefaultTableModel model = new DefaultTableModel(columns, 0);

// JTable with model
JTable table = new JTable(model);
model.addRow(new Object[]{"Shraddha", "BTech", "100"});

// Scroll pane (IMPORTANT for table)
JScrollPane sp = new JScrollPane(table);
sp.setBounds(50, 200, 300, 120);
f.add(sp);
        
       
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close button fix
        f.setVisible(true); // ⭐ MOST IMPORTANT

    }
}

