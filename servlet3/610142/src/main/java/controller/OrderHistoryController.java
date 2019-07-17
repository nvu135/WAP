package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/checkout.do")
public class OrderHistoryController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/views/checkout.jsp").forward(
				request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String street = request.getParameter("street");
		String city = request.getParameter("city");
		String zipcode = request.getParameter("zipCode");
		String state = request.getParameter("state");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String cardNumber = request.getParameter("cartNumber");
		HttpSession session = request.getSession();

		session.setAttribute("cart", null);
		request.getRequestDispatcher("/views/thankyou.jsp").forward(request, response);;
	}
	
}
