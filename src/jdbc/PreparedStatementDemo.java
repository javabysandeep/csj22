package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) throws SQLException {
        String url ="jdbc:mysql://localhost:3306/csj23";
        String username = "root";
        String password ="root@1234";
        String query = "insert into student(id,name) values(?,?)";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student name and id to be stored in the DB");
        int id = scanner.nextInt();
        String studentName = scanner.next();

        Connection connection = DriverManager.getConnection(url, username, password);

        PreparedStatement prepareStatement = connection.prepareStatement(query);
        prepareStatement.setInt(1,id);
        prepareStatement.setString(2,studentName);

        int i = prepareStatement.executeUpdate();
        System.out.println("Records inserted "+i);

        connection.close();

    }
}
