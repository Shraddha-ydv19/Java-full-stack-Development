package com.college;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentSearch {

    public StudentSearch() {

        JFrame f = new JFrame("Search Teacher");
        f.setSize(450, 450);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.BLACK);

        JLabel l = new JLabel("Enter Roll Number");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setBounds(50, 20, 300, 30);
        l.setForeground(Color.WHITE);
        l.setFont(new Font("Arial", Font.BOLD, 16));
        f.add(l);

        JTextField t = new JTextField();
        t.setBounds(100, 70, 200, 30);
        f.add(t);

        JButton b = new JButton("Search");
        b.setBounds(70, 120, 100, 30);
        f.add(b);

        JButton b2 = new JButton("Show All");
        b2.setBounds(200, 120, 120, 30);
        f.add(b2);

        String[] columns = {"Name", "Roll Number"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);

        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(50, 180, 330, 150);
        f.add(sp);

        // SEARCH
        b.addActionListener(e -> {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/test",
                        "root",
                        "Shraddha@19"
                );

                String sql = "SELECT * FROM teacher WHERE RollNo=?";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setInt(1, Integer.parseInt(t.getText()));

                ResultSet rs = pstmt.executeQuery();
                model.setRowCount(0);

                if (rs.next()) {
                    model.addRow(new Object[]{
                            rs.getString("Name"),
                            rs.getInt("RollNo")
                    });
                } else {
                    JOptionPane.showMessageDialog(null, "Not Found");
                }

                con.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        });

        // SHOW ALL
        b2.addActionListener(e -> {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/test",
                        "root",
                        "Shraddha@19"
                );

                System.out.println("Connected!");

                String sql = "SELECT * FROM teacher";
                PreparedStatement pstmt = con.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();

                model.setRowCount(0);

                while (rs.next()) {
                    model.addRow(new Object[]{
                            rs.getString("Name"),
                            rs.getInt("RollNo")
                    });
                }

                con.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                ex.printStackTrace(); // yaha allowed hai
            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new StudentSearch();
    }
}