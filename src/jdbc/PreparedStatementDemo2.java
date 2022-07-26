package jdbc;

import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDemo2 {
    public static void main(String[] args) throws SQLException {
        String url ="jdbc:mysql://localhost:3306/csj23";
        String username = "root";
        String password ="root@1234";
        String query = "select * from student where id=?";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id to be fetched from the DB");
        int id = scanner.nextInt();

        Connection connection = DriverManager.getConnection(url, username, password);

        PreparedStatement prepareStatement = connection.prepareStatement(query);
        prepareStatement.setInt(1,id);

        ResultSet resultSet = prepareStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+"\t" +
                    resultSet.getString(2));
        }
        connection.close();

    }
}
