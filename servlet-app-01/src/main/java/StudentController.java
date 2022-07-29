import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "StudentController", urlPatterns = "/students")
public class StudentController extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        StudentService studentService = new StudentService();
       List<Student> studentList= studentService.getStudents();
       res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.print("List of students "+studentList);
    }
}
