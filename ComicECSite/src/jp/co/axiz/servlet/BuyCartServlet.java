package jp.co.axiz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.entity.ComicInfo;
import jp.co.axiz.entity.UserInfo;

@WebServlet("/BuyCart")
public class BuyCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();

		UserInfo userInfo = (UserInfo) session.getAttribute("LoginUser");

		Integer balance = userInfo.getBalance();

		List<ComicInfo> cartList = (List<ComicInfo>) session.getAttribute("userCart");

		session.setAttribute("userCart", cartList);
		session.setAttribute("balance", balance);

		request.getRequestDispatcher("/Buy.jsp").forward(request, response);
	}
}
