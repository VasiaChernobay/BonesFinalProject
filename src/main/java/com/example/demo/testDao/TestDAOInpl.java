package com.example.demo.testDao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestDAOInpl implements TestDao{

        private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public String toString() {
        return url;
    }

    @Override
    public List<TestDAOInpl> list() {
        List<TestDAOInpl>list=new ArrayList<>();
        Statement statement=null;
        String sql="select urlgif from bodyparts";
        Connection connection=null;
        try {
            connection=dataSource.getConnection();
            statement=connection.createStatement();
            ResultSet resultSet= statement.executeQuery(sql);
            while (resultSet.next()){
                TestDAOInpl testDAOInpl=new TestDAOInpl();
                testDAOInpl.setUrl(resultSet.getString(1));
                list.add(testDAOInpl);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
