package jdbc;


import com.mysql.cj.jdbc.StatementImpl;

import java.sql.*;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url ="jdbc:mysql://localhost:3306/csj23";
        String username = "root";
        String password ="root@1234";
        String query = "select * from student";

        //step 1. Register the drive with the DriverManager. It is done by loading the class
        //Static block inside the Driver class will register the Driver
        //Before java 1.7 we needed to load the class explicitly
        // Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(query);
//        statement.execute()// DLL query
//        statement.executeUpdate()//dml: insert, delete, update

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+"\t"+
                    resultSet.getString(2));
        }

        //close the connection
        connection.close();
    }
}
