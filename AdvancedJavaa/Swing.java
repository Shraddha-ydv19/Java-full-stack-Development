package AdvancedJavaa;

import javax.swing.*;

public class Swing {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing Example");
        frame.setSize(400, 400);
        frame.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JButton button = new JButton("click me");
        // button.setBounds(120, 100, 150, 150);

        // frame.add(button);

        // JTextField textField = new JTextField();
        // textField.setBounds(100,100,100,30);
        // frame.add(textField);
        // JPasswordField passwordField = new JPasswordField();
        // passwordField.setBounds(100,150,100,30);
        // frame.add(passwordField);

        //Table......
        // String column[]={"id","name","age"};
        // String data[][]={{"101","pratik","22"},{"102","pratik","22"},{"103","pratik","22"}};
        // JTable table =new JTable(data,column);
        // table.setBounds(30,40,200,300); 
        // frame.add(table);


       // JOptionPane.showMessageDialog(frame, "welcome to java swing" , "ALERT", JOptionPane.WARNING_MESSAGE);


       JMenuBar menuBar = new JMenuBar();
       JMenu menu,subMenu;
       
       JMenuItem l1 ,l2,l3,l4;
         menu = new JMenu("File");
            subMenu = new JMenu("New");
           l1= new JMenuItem("project");
              l2= new JMenuItem("file");
                menu.add(l1);
                menu.add(l2);

                menu.add(subMenu);
                l3 = new JMenuItem("open");
                l4 = new JMenuItem("save"); 
                subMenu.add(l3);
                subMenu.add(l4);
                menu.add(subMenu);
                menuBar.add(menu);
              frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}