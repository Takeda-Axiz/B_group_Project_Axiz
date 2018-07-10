package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.service.CartService;

@WebServlet("/SendCartServlet")
public class SendCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		CartService cs = new CartService(request, response);
		cs.showCart();

		request.getRequestDispatcher("/Cart.jsp").forward(request, response);
	}

}