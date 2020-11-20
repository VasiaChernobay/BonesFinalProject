package com.example.demo.ui;


import com.example.demo.image.ImageDaoImpl;
import com.example.demo.testDao.TestDAOInpl;

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
    private JButton button4;

    private JFrame frame1;
    private JFrame frame2;
    private JFrame frame3;
    private JFrame frame4;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

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




    public UISwing(TestDAOInpl testDAOInpl, ImageDaoImpl imageDao1) throws SQLException {

        frame=new JFrame();
        frame1=new JFrame();
        frame2=new JFrame();
        frame3=new JFrame();
        frame4=new JFrame();

        panel=new JPanel();
        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        panel4=new JPanel();

        panel.setLayout(new GridLayout());
        panel1.setLayout(new GridBagLayout());
        panel2.setLayout(new GridLayout());
        panel3.setLayout(new GridLayout());
        panel4.setLayout(new GridLayout());

         ButtonInitActionListener1 buttonInitActionListener1=new ButtonInitActionListener1();
         ButtonInitActionListener2 buttonInitActionListener2=new ButtonInitActionListener2();
         ButtonInitActionListener4 buttonInitActionListener4=new ButtonInitActionListener4();

        button1=new JButton(new ImageIcon(String.valueOf(imageDao1.list().get(0))));
        button2=new JButton(new ImageIcon(String.valueOf(imageDao1.list().get(1))));
        button3=new JButton(new ImageIcon(String.valueOf(imageDao1.list().get(2))));
        button4=new JButton(new ImageIcon(String.valueOf(imageDao1.list().get(3))));

        button1.addActionListener(this);
        button2.addActionListener(buttonInitActionListener1);
        button3.addActionListener(buttonInitActionListener2);
        button4.addActionListener(buttonInitActionListener4);


        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800, 600);


        label1 =new JLabel(new ImageIcon(String.valueOf(testDAOInpl.list().get(0))));
        label2=new JLabel(new ImageIcon(String.valueOf(testDAOInpl.list().get(1))));
        label3=new JLabel(new ImageIcon(String.valueOf(testDAOInpl.list().get(2))));
        label4=new JLabel(new ImageIcon(String.valueOf(testDAOInpl.list().get(3))));
        label5=new JLabel(new ImageIcon(String.valueOf(testDAOInpl.list().get(4))));
        label6=new JLabel(new ImageIcon(String.valueOf(testDAOInpl.list().get(5))));
        label7=new JLabel(new ImageIcon(String.valueOf(testDAOInpl.list().get(6))));
        label8=new JLabel(new ImageIcon(String.valueOf(testDAOInpl.list().get(7))));
        label9=new JLabel(new ImageIcon(String.valueOf(testDAOInpl.list().get(8))));
        label10=new JLabel(new ImageIcon(String.valueOf(testDAOInpl.list().get(9))));
        label11=new JLabel(new ImageIcon(String.valueOf(testDAOInpl.list().get(10))));
        label12=new JLabel(new ImageIcon(String.valueOf(testDAOInpl.list().get(11))));
        label13=new JLabel(new ImageIcon(String.valueOf(testDAOInpl.list().get(12))));
        label14=new JLabel(new ImageIcon(String.valueOf(testDAOInpl.list().get(13))));
        label15=new JLabel(new ImageIcon(String.valueOf(testDAOInpl.list().get(14))));
        label16=new JLabel(new ImageIcon(String.valueOf(testDAOInpl.list().get(15))));


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        frame1.setSize(800,600);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame1.setLocation(300,300);
        frame1.add(panel1);
        panel1.add(label10);
        panel1.add(label11);
        panel1.add(label12);
        panel1.add(label13);

    }

    class  ButtonInitActionListener1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {




            frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame2.setSize(600,600);
            frame2.setVisible(true);
            frame2.setLocation(300,300);

            frame2.add(panel2);
            panel2.add(label1);
            panel2.add(label2);
            panel2.add(label3);
            panel2.add(label4);
            panel2.add(label5);
            panel2.add(label6);
        }
    }
    class ButtonInitActionListener2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            frame3.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame3.setSize(800,600);
            frame3.setVisible(true);

       frame3.add(panel3);
       panel3.add(label14);
       panel3.add(label15);
       panel3.add(label16);

        }
    }
    class ButtonInitActionListener4 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            frame4.setDefaultCloseOperation(EXIT_ON_CLOSE);
            frame4.setSize(800,600);
            frame4.setVisible(true);

            frame4.add(panel4);
            panel4.add(label7);
            panel4.add(label8);
            panel4.add(label9);

        }
    }

}
