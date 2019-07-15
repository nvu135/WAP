package controller.overview;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/overview.do")
public class OverviewServlet extends HttpServlet {

	private OverviewService overviewService = new OverviewService();

	protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("teachers", overviewService.retrieveTeachers());
		request.getRequestDispatcher("/WEB-INF/views/overview.jsp").forward(
				request, response);
	}
}