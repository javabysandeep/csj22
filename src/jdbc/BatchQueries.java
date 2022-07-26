package jdbc;

import java.sql.*;
import java.util.Scanner;

public class BatchQueries {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/csj23";
        String username = "root";
        String password = "root@1234";
        String query1 = "insert into student(name) values('abc')";
        String query2 = "insert into student(name) values('xyz')";
        String query3 = "insert into student(name) values('pqr')";
        String query4 = "insert into student(name) values('mnop')";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        statement.addBatch(query1);
        statement.addBatch(query2);
        statement.addBatch(query3);
        statement.addBatch(query4);

        int[] status = statement.executeBatch();
        for (int i:status) {
            System.out.println("Status "+i);
        }
        connection.close();
    }
}
