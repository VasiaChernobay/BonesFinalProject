package com.example.demo;


import com.example.demo.image.ImageDaoImpl;
import com.example.demo.testDao.TestDAOInpl;
import com.example.demo.ui.UISwing;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("JdbcContext");

        ImageDaoImpl imageDao1=context.getBean("imageDAO", ImageDaoImpl.class);



        TestDAOInpl testDAOInpl=context.getBean("DAO",TestDAOInpl.class);
        System.out.println(testDAOInpl.list().get(0));
        System.out.println(imageDao1.list().get(0));
        UISwing uiSwing=new UISwing(testDAOInpl,imageDao1);

    }

}
