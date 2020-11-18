package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class UISwing extends JFrame implements ActionListener {


    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    private JFrame frame1;
    private JFrame frame2;
    private JFrame frame3;
    private JFrame frame4;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;

    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;



    UISwing(BodyDaoIml bodyDao1, BodyDaoIml bodyDao2, BodyDaoIml bodyDao3, BodyDaoIml bodyDao4, ImageDaoImpl imageDao1, ImageDaoImpl imageDao2, ImageDaoImpl imageDao3, ImageDaoImpl imageDao4) throws SQLException {

        frame=new JFrame();
        frame1=new JFrame();
        frame2=new JFrame();
        frame3=new JFrame();

        panel=new JPanel();
        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();

        panel.setLayout(new GridLayout());
        panel1.setLayout(new GridBagLayout());

         ButtonInitActionListener1 buttonInitActionListener1=new ButtonInitActionListener1();
         ButtonInitActionListener2 buttonInitActionListener2=new ButtonInitActionListener2();

        button1=new JButton(new ImageIcon(imageDao1.initImageDao1(imageDao1)));
        button2=new JButton(new ImageIcon(imageDao2.initImageDao2(imageDao2)));
        button3=new JButton(new ImageIcon(imageDao3.initImageDao3(imageDao3)));

        button1.addActionListener(this);
        button2.addActionListener(buttonInitActionListener1);
        button3.addActionListener(buttonInitActionListener2);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 600);


        label=new JLabel(new ImageIcon(bodyDao1.initBodyDao1(bodyDao1)));
        label2=new JLabel(new ImageIcon(bodyDao2.initBodyDao2(bodyDao2)));
        label3=new JLabel(new ImageIcon(bodyDao3.initBodyDao3(bodyDao3)));
//        label4=new JLabel(new ImageIcon(bodyDao4.getUrl4()));


    }
    public static void buttonInit(UISwing uiSwing) {
        JButton button1 =uiSwing.button1;
        JButton button2= uiSwing.button2;
        JButton button3= uiSwing.button3;

        button1.addActionListener(uiSwing);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        frame1.setSize(800,600);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame1.setLocation(300,300);


    }

    class  ButtonInitActionListener1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {


            panel2.add(label);
            panel2.add(label2);
            panel2.add(label3);
            panel2.add(label);
            frame2.setVisible(true);
            frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame2.setSize(400,600);
            frame2.setLocation(300,300);

            frame2.add(panel2);
        }
    }
    class ButtonInitActionListener2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            frame1.setVisible(true);
            frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame1.setSize(800,600);

        panel1.add(label3);
        panel1.add(label2);
        frame1.add(panel1);
        }
    }


}
