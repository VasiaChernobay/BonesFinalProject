package com.example.demo;

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
       imageDao2.setId2(ImageE.KNEE.getId());
       imageDao3.setId3(ImageE.SHOULDER.getId());
       imageDao4.setId4(ImageE.NECK.getId());

       bodyDao1.setId(BodyE.KNEE1.getId());
       bodyDao2.setId2(BodyE.KNEE2.getId());
       bodyDao3.setId3(BodyE.KNEE3.getId());
        System.out.println(bodyDao1.initBodyDao1(bodyDao1));
        System.out.println(bodyDao2.initBodyDao2(bodyDao2));
        System.out.println(bodyDao3.initBodyDao3(bodyDao3));

//        body.setId(BodyE.KNEE1.getId());
//        body2.setId2(BodyE.KNEE2.getId());
//        body3.setId3(BodyE.KNEE3.getId());
//        body4.setId4(BodyE.NEEK1.getId());
//        body5.setId5(BodyE.NEEK2.getId());
//        body6.setId6(BodyE.SHOULDER1.getId());


//
//        jdbcDao.setIdKnee(body.getId());
//        jdbcDao1.setIdKnee2(body2.getId2());
//        jdbcDao2.setIdKnee3(body3.getId3());
//        jdbcDao3.setIdKnee4(body4.getId4());
//        jdbcDao4.setIdKnee5(body5.getId5());
//
//
//        jdbcDao.init(body,jdbcDao);
//        jdbcDao1.init1(body2,jdbcDao);
//        jdbcDao2.init3(body3,jdbcDao);
//        jdbcDao3.init4(body4,jdbcDao);
//        jdbcDao4.init5(body4,jdbcDao);





        UISwing uiSwing=new UISwing(bodyDao1,bodyDao2,bodyDao3,bodyDao4,imageDao1,imageDao2,imageDao3,imageDao4);









        context.close();
    }

}
