package jdbc;


import java.sql.DriverManager;
import java.sql.SQLException;

public class DropTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url ="jdbc:mysql://localhost:3306/csj23";
        String username = "root";
        String password ="root@1234";
        String query = "drop table student23";

        boolean execute = DriverManager.getConnection(url, username, password).createStatement().execute(query);
        System.out.println("Table dropped "+execute);

        
    }
}
