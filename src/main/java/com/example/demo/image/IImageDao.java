package com.example.demo.image;

import com.example.demo.testDao.TestDAOInpl;

import java.sql.SQLException;
import java.util.List;

public interface IImageDao {

    List<ImageDaoImpl> list();
}
