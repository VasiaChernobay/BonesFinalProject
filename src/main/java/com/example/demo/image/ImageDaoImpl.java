package com.example.demo.image;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ImageDaoImpl implements IImageDao {
    private  int id;
    private  int id2;
    private  int id3;
    private  int id4;
    private String url2;
    private String url3;
    private String url4;
    private DataSource dataSource2;
    private DataSource dataSource3;
    private DataSource dataSource4;

    public DataSource getDataSource2() {
        return dataSource2;
    }

    public void setDataSource2(DataSource dataSource2) {
        this.dataSource2 = dataSource2;
    }

    public DataSource getDataSource3() {
        return dataSource3;
    }

    public void setDataSource3(DataSource dataSource3) {
        this.dataSource3 = dataSource3;
    }

    public DataSource getDataSource4() {
        return dataSource4;
    }

    public void setDataSource4(DataSource dataSource4) {
        this.dataSource4 = dataSource4;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public int getId3() {
        return id3;
    }

    public void setId3(int id3) {
        this.id3 = id3;
    }

    public int getId4() {
        return id4;
    }

    public void setId4(int id4) {
        this.id4 = id4;
    }

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        this.url2 = url2;
    }

    public String getUrl3() {
        return url3;
    }

    public void setUrl3(String url3) {
        this.url3 = url3;
    }

    public String getUrl4() {
        return url4;
    }

    public void setUrl4(String url4) {
        this.url4 = url4;
    }


    private String url;

    private DataSource dataSource;
    @Override
    public String initImageDao1(ImageDaoImpl imageDao1) throws SQLException {
        String sqlSelect1 = "select imageurl from image where id="+getId();

        Connection connection1= null;
        try {
            connection1=dataSource.getConnection();
            Statement statement1=connection1.createStatement();
            ResultSet resultSet1=statement1.executeQuery(sqlSelect1);
            while (resultSet1.next()){

                imageDao1.setUrl(resultSet1.getString(1));
            }
        }catch (SQLException e) {
            e.printStackTrace();

        }

      return imageDao1.getUrl();
    }

   @Override
    public String initImageDao2(ImageDaoImpl imageDao2) throws SQLException {
        String sqlSelect2 = "select imageurl from image where id="+getId2();

        Connection connection2= null;
        try {
            connection2=dataSource2.getConnection();
            Statement statement2=connection2.createStatement();
            ResultSet resultSet2=statement2.executeQuery(sqlSelect2);
            while (resultSet2.next()){

                imageDao2.setUrl2(resultSet2.getString(1));
            }
        }catch (SQLException e) {
            e.printStackTrace();

        }

        return imageDao2.getUrl2();
    }

     @Override
    public String initImageDao3(ImageDaoImpl imageDao3) throws SQLException {
        String sqlSelect3 = "select imageurl from image where id="+getId3();

        Connection connection3= null;
        try {
            connection3=dataSource3.getConnection();
            Statement statement3=connection3.createStatement();
            ResultSet resultSet3=statement3.executeQuery(sqlSelect3);
            while (resultSet3.next()){

                imageDao3.setUrl3(resultSet3.getString(1));
            }
        }catch (SQLException e) {
            e.printStackTrace();

        }

        return imageDao3.getUrl3();
    }
    @Override
    public String initImageDao4(ImageDaoImpl imageDao4) throws SQLException {
        String sqlSelect3 = "select imageurl from image where id="+getId4();

        Connection connection4= null;
        try {
            connection4=dataSource4.getConnection();
            Statement statement4=connection4.createStatement();
            ResultSet resultSet4=statement4.executeQuery(sqlSelect3);
            while (resultSet4.next()){

                imageDao4.setUrl4(resultSet4.getString(1));
            }
        }catch (SQLException e) {
            e.printStackTrace();

        }

        return imageDao4.getUrl4();
    }
}
