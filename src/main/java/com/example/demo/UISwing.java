package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class UISwing extends JFrame implements ActionListener {


    private JFrame frame;
    private JPanel panel;
    private JLabel label1;
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
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JLabel label16;




    UISwing(BodyDaoIml bodyDao1, BodyDaoIml bodyDao2, BodyDaoIml bodyDao3, BodyDaoIml bodyDao4, BodyDaoIml bodyDao5,BodyDaoIml bodyDao6,BodyDaoIml bodyDao7,BodyDaoIml bodyDao8,BodyDaoIml bodyDao9,BodyDaoIml bodyDao10,BodyDaoIml bodyDao11,BodyDaoIml bodyDao12,BodyDaoIml bodyDao13,BodyDaoIml bodyDao14,BodyDaoIml bodyDao15,BodyDaoIml bodyDao16,BodyDaoIml bodyDao17,BodyDaoIml bodyDao18,ImageDaoImpl imageDao1, ImageDaoImpl imageDao2, ImageDaoImpl imageDao3, ImageDaoImpl imageDao4) throws SQLException {

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
        panel2.setLayout(new GridBagLayout());
        panel3.setLayout(new GridBagLayout());

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


        label1 =new JLabel(new ImageIcon(bodyDao1.initBodyDao1(bodyDao1)));
        label2=new JLabel(new ImageIcon(bodyDao2.initBodyDao2(bodyDao2)));
        label3=new JLabel(new ImageIcon(bodyDao3.initBodyDao3(bodyDao3)));
        label4=new JLabel(new ImageIcon(bodyDao4.initBodyDao4(bodyDao4)));
        label5=new JLabel(new ImageIcon(bodyDao5.initBodyDao5(bodyDao5)));
        label6=new JLabel(new ImageIcon(bodyDao6.initBodyDao6(bodyDao6)));
        label7=new JLabel(new ImageIcon(bodyDao7.initBodyDao7(bodyDao7)));
        label8=new JLabel(new ImageIcon(bodyDao8.initBodyDao8(bodyDao8)));
        label9=new JLabel(new ImageIcon(bodyDao9.initBodyDao9(bodyDao9)));
        label10=new JLabel(new ImageIcon(bodyDao10.initBodyDao10(bodyDao10)));
        label11=new JLabel(new ImageIcon(bodyDao11.initBodyDao11(bodyDao11)));
        label12=new JLabel(new ImageIcon(bodyDao12.initBodyDao12(bodyDao12)));
        label13=new JLabel(new ImageIcon(bodyDao13.initBodyDao12(bodyDao13)));
        label14=new JLabel(new ImageIcon(bodyDao14.initBodyDao13(bodyDao14)));
        label15=new JLabel(new ImageIcon(bodyDao15.initBodyDao14(bodyDao15)));
        label16=new JLabel(new ImageIcon(bodyDao16.initBodyDao16(bodyDao16)));


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        frame1.setSize(800,600);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame1.setLocation(300,300);
        frame1.add(panel1);
        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);
        panel1.add(label4);
        panel1.add(label5);
        panel1.add(label6);

    }

    class  ButtonInitActionListener1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {




            frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame2.setSize(600,600);
            frame2.setVisible(true);
            frame2.setLocation(300,300);

            frame2.add(panel2);
            panel2.add(label7);
            panel2.add(label8);
            panel2.add(label9);
        }
    }
    class ButtonInitActionListener2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            frame3.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame3.setSize(800,600);
            frame3.setVisible(true);

       frame3.add(panel3);
       panel3.add(label10);
       panel3.add(label11);
       panel3.add(label12);

        }
    }


}
