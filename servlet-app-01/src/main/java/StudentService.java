import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        StudentDao studentDao = new StudentDao();
        return studentDao.getStudents();
    }
}
