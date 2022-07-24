package jdbc;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url ="jdbc:mysql://localhost:3306/csj23";
        String username = "root";
        String password ="root@1234";
        String query = "create table student23(id int primary key auto_increment,name varchar(200))";

        boolean execute = DriverManager.getConnection(url, username, password).createStatement().execute(query);
        System.out.println("Table created "+execute);


    }
}
