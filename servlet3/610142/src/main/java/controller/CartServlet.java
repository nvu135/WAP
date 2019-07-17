package controller;

import model.Cart;
import model.Product;
import service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/cart.do")
public class CartServlet extends HttpServlet {

	private ProductService overviewService = new ProductService();

	protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
		Cart shoppingCart;
//		if (request.getParameter("addCart") != null) {
//			HttpSession session = request.getSession();
//			shoppingCart = (Cart) session.getAttribute("cart");
//			if (shoppingCart == null) {
//				shoppingCart = new Cart();
//				session.setAttribute("cart", shoppingCart);
//			}
//			String productId = request.getParameter("addCart");
//			Product product = overviewService.get(productId);
//			shoppingCart.add(product);
//			session.setAttribute("cart", shoppingCart);
//		}
//		request.setAttribute("products", overviewService.getProducts());
		HttpSession session = request.getSession();
		shoppingCart = (Cart) session.getAttribute("cart");
		request.getRequestDispatcher("/views/cart.jsp").forward(
				request, response);
	}
}