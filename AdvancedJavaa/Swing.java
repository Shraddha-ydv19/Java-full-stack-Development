package AdvancedJavaa;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JFileChooser.*;

public class Swing {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing Example");
        frame.setSize(400, 400);
        frame.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JButton button = new JButton("Click Me");
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


    //    JMenuBar menuBar = new JMenuBar();
    //    JMenu menu,subMenu;
       
    //    JMenuItem l1 ,l2,l3,l4;
    //      menu = new JMenu("File");
    //         subMenu = new JMenu("New");
    //        l1= new JMenuItem("project");
    //           l2= new JMenuItem("file");
    //             menu.add(l1);
    //             menu.add(l2);

    //             menu.add(subMenu);
    //             l3 = new JMenuItem("open");
    //             l4 = new JMenuItem("save"); 
    //             subMenu.add(l3);
    //             subMenu.add(l4);
    //             menu.add(subMenu);
    //             menuBar.add(menu);
    //           frame.setJMenuBar(menuBar);



    //Tree......
    // DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
    // DefaultMutableTreeNode child1 =new DefaultMutableTreeNode("Child 1");
    // DefaultMutableTreeNode child2 =new DefaultMutableTreeNode("Child 2");
    // root.add(child1);
    // root.add(child2);
    // DefaultMutableTreeNode grandChild1 = new DefaultMutableTreeNode("Grandchild 1");
    // DefaultMutableTreeNode grandChild2 = new DefaultMutableTreeNode("Grandchild 2");
    // child1.add(grandChild1);
    // child1.add(grandChild2);
    // JTree tree = new JTree(root);
    // tree.setBounds(50, 50, 200, 300);
    // frame.add(tree);
     

    //FileChooser......
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.showSaveDialog(null);

        frame.setVisible(true);
    }
}