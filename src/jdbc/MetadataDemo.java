package jdbc;

import java.sql.*;

public class MetadataDemo {
    public static void main(String[] args) throws SQLException {
        String url ="jdbc:mysql://localhost:3306/csj23";
        String username = "root";
        String password ="root@1234";
        String query = "select * from student";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        //data
        ResultSet resultSet = statement.executeQuery(query);

        //metadata : data about fetched data
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        System.out.println("No of columns "+resultSetMetaData.getColumnCount());
        System.out.println("Id type "+ resultSetMetaData.getColumnType(1));
        System.out.println("Table name "+resultSetMetaData.getTableName(1));

        connection.close();

    }
}
