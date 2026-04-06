package com.shraddha;
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
public class Ipfinder {
    public static void main(String[] args){
        JFrame f=new JFrame("IP Finder");
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(300,300);
        JLabel l=new JLabel("IP Finder");
        l.setBounds(100,10,100,30);
        f.add(l);
        JTextField t1=new JTextField();
        t1.setBounds(50,50,200,30);
        f.add(t1);
        JTextField  t2 = new JTextField();
        t2.setBounds(50,90,200,30);
        f.add(t2);
        JButton btn =new JButton("Click me");
        btn.setBounds(100,180,80,30);
        f.add(btn);
        
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String  url =t1.getText();
                try{
                    InetAddress is=InetAddress.getByName(url);
                    String ip=is.getHostAddress();
                    JOptionPane.showMessageDialog(f, ip);
                }
                catch(UnknownHostException ex){
                    JOptionPane.showMessageDialog(f, ex.toString());
                }
            }
        });
    }
}
