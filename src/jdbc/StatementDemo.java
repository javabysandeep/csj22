package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementDemo {
    public static void main(String[] args) throws SQLException {
        String url ="jdbc:mysql://localhost:3306/csj23";
        String username = "root";
        String password ="root@1234";
        String query = "insert into student(name) values('";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student name to be stored in the DB");
        String studentName = scanner.next();
        query = query + studentName+"')";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(query);
        System.out.println("Records inserted "+i);

        connection.close();

    }
}
