package com.example.demo;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BodyDaoIml implements IBodyDao {
    private DataSource dataSource1;
    private DataSource dataSource2;
    private DataSource dataSource3;
    private DataSource dataSource4;
    private  int id;
    private  int id2;
    private  int id3;
    private  int id4;
    private String url1;

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1;
    }

    private String url2;
    private String url3;
    private String url4;

    public DataSource getDataSource1() {
        return dataSource1;
    }

    public void setDataSource1(DataSource dataSource1) {
        this.dataSource1 = dataSource1;
    }

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

    @Override
    public String initBodyDao1(BodyDaoIml bodyDao1) throws SQLException {
        Connection connection=null;
        String sqlSelect1="select gifUrl from body where id="+getId();
        try {
            connection=dataSource1.getConnection();
            Statement statement1=connection.createStatement();
            ResultSet resultSet1=statement1.executeQuery(sqlSelect1);
            while (resultSet1.next()){

                bodyDao1.setUrl1(resultSet1.getString(1));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return bodyDao1.getUrl1();
    }

    @Override
    public String initBodyDao2(BodyDaoIml bodyDao2) throws SQLException {
        Connection connection=null;
        String sqlSelect2="select gifUrl from body where id="+getId2();
        try {
            connection=dataSource2.getConnection();
            Statement statement2=connection.createStatement();
            ResultSet resultSet2=statement2.executeQuery(sqlSelect2);
            while (resultSet2.next()){

                bodyDao2.setUrl1(resultSet2.getString(1));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return bodyDao2.getUrl2();
    }

    @Override
    public String initBodyDao3(BodyDaoIml bodyDao3) throws SQLException {
        Connection connection=null;
        String sqlSelect3="select gifUrl from body where id="+getId3();
        try {
            connection=dataSource3.getConnection();
            Statement statement3=connection.createStatement();
            ResultSet resultSet3= statement3.executeQuery(sqlSelect3);
            while (resultSet3.next()){

                bodyDao3.setUrl3(resultSet3.getString(1));

            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return bodyDao3.getUrl3();
    }

    @Override
    public String initBodyDao4(BodyDaoIml bodyDao4) throws SQLException{
        Connection connection=null;
        String sqlSelect4="select gifUrl from body where id="+getId4();
        try {
            connection=dataSource4.getConnection();
            Statement statement4=connection.createStatement();
            ResultSet resultSet4=statement4.executeQuery(sqlSelect4);
            while (resultSet4.next()){

                bodyDao4.setUrl4(resultSet4.getString(1));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return bodyDao4.getUrl4();
    }
}

