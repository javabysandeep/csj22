package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallStoredProcedure {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/csj23";
        String username = "root";
        String password = "root@1234";

        String sql = "call stud_count()";
        Connection connection = DriverManager.getConnection(url, username, password);
        CallableStatement callableStatement = connection.prepareCall(sql);
        boolean execute = callableStatement.execute();
        System.out.println("Called stored proc " + execute);
        connection.close();
    }
}
