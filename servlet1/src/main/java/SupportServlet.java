import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

public class SupportServlet extends HttpServlet {
    private static final Random r = new Random(); // <- shared resource
    // ...

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/support.jsp").forward(
                request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");


        request.setAttribute("name", name);
        request.setAttribute("email", email);
        String supportEmail= getServletContext().getInitParameter("SupportEmail");
        long support_ticket_id = r.nextLong();

        request.setAttribute("supportEmail", supportEmail);
        request.setAttribute("support_ticket_id", support_ticket_id);

        request.getRequestDispatcher("/WEB-INF/views/submitted.jsp").forward(
                request, response);


    }
}
