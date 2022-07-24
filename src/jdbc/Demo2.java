package jdbc;


import java.sql.*;

public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url ="jdbc:mysql://localhost:3306/csj23";
        String username = "root";
        String password ="root@1234";
        String query = "select * from student";

        ResultSet resultSet = DriverManager.getConnection(url, username, password).createStatement().executeQuery(query);

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+"\t"+
                    resultSet.getString(2));
        }
    }
}
