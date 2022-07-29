import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public List<Student> getStudents() {
        String username = "root";
        String password = "root@1234";
        String url = "jdbc:mysql://localhost:3306/csj23";
        String query = "select * from student";
        List<Student> studentList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(url, username, password);) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Student student = Student.builder()
                        .studentId(resultSet.getInt(1))
                        .studentName(resultSet.getString(2))
                        .build();
                studentList.add(student);
            }
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }
        return studentList;
    }
}
