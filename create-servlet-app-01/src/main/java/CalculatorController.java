import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorController implements Servlet {
    public CalculatorController() {
        System.out.println("Constructor called of CalculatorController");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Init method");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service method");
        //read the details which are sent by the client
        int number1 = Integer.parseInt((String) req.getParameter("number1"));
        int number2 = Integer.parseInt((String) req.getParameter("number2"));
        String operation = (String) req.getParameter("operation");
        int result = 0;

        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            case "%":
                result = number1 % number2;
                break;
            default:
        }
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.println("Operation "+operation+": result "+result);

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy method");
    }
}
