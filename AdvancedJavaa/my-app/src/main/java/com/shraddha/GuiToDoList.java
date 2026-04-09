package com.shraddha;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.DefaultListModel;


public class GuiToDoList {
    private static DefaultListModel<String> lm;
    public static void main(String[] args){
        lm = new DefaultListModel<>();
        JFrame f=new JFrame("To Do List");
        f.setLayout(null);
        f.setSize(400, 300);
        JLabel l=new JLabel("To Do List");
        l.setBounds(130,20,100,30);
        f.add(l);
        JTextField t1 =new JTextField("Enter Task");
        t1.setBounds(120,60,200,30);
        f.add(t1);
        JTextArea ta = new JTextArea();
        JScrollPane sp = new JScrollPane(ta);
        sp.setBounds(120, 100, 200, 100);
        f.add(sp);
 

        JButton btn =new JButton("Add");
        btn.setBounds(100,210,80,30);
        f.add(btn);

        JButton btn2= new JButton("Clear");
        btn2.setBounds(210,210,80,30);
        f.add(btn2);
        
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String task = t1.getText();

                if(!task.isEmpty()){
                    lm.addElement(task);        // store in model
                    ta.append(task + "\n");     // show in textarea
                    t1.setText("");             // clear input
                }
                else{
                    JOptionPane.showMessageDialog(f, "Please enter a task");
                }
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                lm.clear();
            //    / ta.setText("");
            }
        });

        // ✅ Visible at end
        f.setVisible(true);
    }
}
