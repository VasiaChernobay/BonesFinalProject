package com.example.demo.image;

import com.example.demo.testDao.TestDAOInpl;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ImageDaoImpl implements IImageDao {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return url;
    }

    @Override
    public List<ImageDaoImpl> list() {
        List<ImageDaoImpl>list=new ArrayList<>();
        Statement statement=null;
        String sql="select imageUrl from image";
        Connection connection=null;
        try {
            connection=dataSource.getConnection();
            statement=connection.createStatement();
            ResultSet resultSet= statement.executeQuery(sql);
            while (resultSet.next()){
                ImageDaoImpl imageDaoimpl=new ImageDaoImpl();
                imageDaoimpl.setUrl(resultSet.getString(1));
                list.add(imageDaoimpl);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
