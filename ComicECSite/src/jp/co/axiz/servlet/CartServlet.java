package jp.co.axiz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.entity.JoinComicInfo;
import jp.co.axiz.service.CartService;

@WebServlet("/Cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		CartService cs = new CartService(request, response);
		String products = cs.addCart();
		List<JoinComicInfo> list = cs.showCart(products);
		HttpSession session = request.getSession();
		session.setAttribute("userCart", list);

		request.getRequestDispatcher("/Cart.jsp").forward(request, response);
	}
}
