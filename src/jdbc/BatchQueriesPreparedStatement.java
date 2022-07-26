package jdbc;

import java.sql.*;
import java.util.Scanner;

public class BatchQueriesPreparedStatement {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/csj23";
        String username = "root";
        String password = "root@1234";
        String query1 = "insert into student(name) values(?)";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student names");

        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement statement = connection.prepareStatement(query1);
        for (int index = 1; index <=5; index++) {
            String studentName = scanner.next();
            statement.addBatch();
        }

        int[] status = statement.executeBatch();
        for (int i:status) {
            System.out.println("Status "+i);
        }
        connection.close();
    }
}
