package com.example.demo;


import com.example.demo.Body.BodyDaoIml;
import com.example.demo.Body.BodyE;
import com.example.demo.image.ImageDaoImpl;
import com.example.demo.image.ImageE;
import com.example.demo.ui.UISwing;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("JdbcContext");

        BodyDaoIml bodyDao1=context.getBean("bodyDAO",BodyDaoIml.class);
        BodyDaoIml bodyDao2=context.getBean("bodyDAO",BodyDaoIml.class);
        BodyDaoIml bodyDao3=context.getBean("bodyDAO",BodyDaoIml.class);
        BodyDaoIml bodyDao4=context.getBean("bodyDAO",BodyDaoIml.class);
        BodyDaoIml bodyDao5=context.getBean("bodyDAO",BodyDaoIml.class);
        BodyDaoIml bodyDao6=context.getBean("bodyDAO",BodyDaoIml.class);
        BodyDaoIml bodyDao7=context.getBean("bodyDAO",BodyDaoIml.class);
        BodyDaoIml bodyDao8=context.getBean("bodyDAO",BodyDaoIml.class);
        BodyDaoIml bodyDao9=context.getBean("bodyDAO",BodyDaoIml.class);
        BodyDaoIml bodyDao10=context.getBean("bodyDAO",BodyDaoIml.class);
        BodyDaoIml bodyDao11=context.getBean("bodyDAO",BodyDaoIml.class);
        BodyDaoIml bodyDao12=context.getBean("bodyDAO",BodyDaoIml.class);
        BodyDaoIml bodyDao13=context.getBean("bodyDAO",BodyDaoIml.class);
        BodyDaoIml bodyDao14=context.getBean("bodyDAO",BodyDaoIml.class);
        BodyDaoIml bodyDao15=context.getBean("bodyDAO",BodyDaoIml.class);
        BodyDaoIml bodyDao16=context.getBean("bodyDAO",BodyDaoIml.class);
        BodyDaoIml bodyDao17=context.getBean("bodyDAO",BodyDaoIml.class);
        BodyDaoIml bodyDao18=context.getBean("bodyDAO",BodyDaoIml.class);



        ImageDaoImpl imageDao1=context.getBean("imageDAO", ImageDaoImpl.class);
        ImageDaoImpl imageDao2=context.getBean("imageDAO", ImageDaoImpl.class);
        ImageDaoImpl imageDao3=context.getBean("imageDAO", ImageDaoImpl.class);
        ImageDaoImpl imageDao4=context.getBean("imageDAO", ImageDaoImpl.class);

        imageDao1.initImageDao1(imageDao1);
        imageDao2.initImageDao2(imageDao2);
        imageDao3.initImageDao3(imageDao3);
        imageDao4.initImageDao4(imageDao4);

        JFrame frame=new JFrame();


     imageDao1.setId(ImageE.BACK.getId());
     imageDao1.setId2(ImageE.KNEE.getId());
     imageDao3.setId3(ImageE.NECK.getId());
     imageDao4.setId4(ImageE.SHOULDER.getId());


      bodyDao1.setId(BodyE.KNEE1.getId());
      bodyDao2.setId2(BodyE.KNEE2.getId());
      bodyDao3.setId3(BodyE.KNEE3.getId());
      bodyDao4.setId4(BodyE.KNEE4.getId());
      bodyDao5.setId5(BodyE.KNEE5.getId());
      bodyDao6.setId6(BodyE.KNEE6.getId());
      bodyDao7.setId7(BodyE.SHOULDER1.getId());
      bodyDao8.setId8(BodyE.SHOULDER2.getId());
      bodyDao9.setId9(BodyE.SHOULDER3.getId());
      bodyDao10.setId10(BodyE.BACK1.getId());
      bodyDao11.setId11(BodyE.BACK2.getId());
      bodyDao12.setId12(BodyE.BACK3.getId());
      bodyDao13.setId13(BodyE.BACK4.getId());
      bodyDao14.setId14(BodyE.NEEK1.getId());
      bodyDao15.setId15(BodyE.NEEK2.getId());
      bodyDao16.setId16(BodyE.NEEK3.getId());



        System.out.println(bodyDao1.initBodyDao1(bodyDao1));


        UISwing uiSwing=new UISwing(bodyDao1,bodyDao2,bodyDao3,bodyDao4,bodyDao5,bodyDao6,bodyDao7,bodyDao8,bodyDao9,bodyDao10,bodyDao11,bodyDao12,bodyDao13,bodyDao14,bodyDao15,bodyDao16,bodyDao17,bodyDao18,imageDao1,imageDao2,imageDao3,imageDao4);









        context.close();
    }

}
