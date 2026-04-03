package com.shraddha;
//import javax.imageio.plugins.tiff.TIFFDirectory;
import javax.swing.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args){
        JFrame f=new JFrame("Calculator");
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

        JLabel l= new JLabel("Calculator");
        l.setBounds(100,10,100,30);
        f.add(l);
        JTextField t1 =new JTextField();
        t1.setBounds(50,50,200,30);
        f.add(t1);

        JTextField t2=new JTextField();
        t2.setBounds(50,90,200,30);
        f.add(t2);

        JTextField result=new JTextField();
        result.setBounds(50,130,200,30);
        f.add(result);

        JButton btn = new JButton();
        btn.setBounds(100,180,80,30);
        f.add(btn);

        //button event handling.....
        btn.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent e){
                    String s1=t1.getText();
                    String s2=t2.getText();
                    int a = Integer.parseInt(s1);
                    int b= Integer.parseInt(s2);
                    int sum =a+b;
                    result.setText(String.valueOf(sum));

                    //clear feilds...
                    t1.setText("");
                    t2.setText("");
                }

        });
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        
    }
    
}
