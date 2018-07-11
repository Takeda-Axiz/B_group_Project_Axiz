package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PointBuyConfirmServlet
 */
@WebServlet("/Point")
public class PointBuyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();

		String user_id = (String) session.getAttribute("user_id");

		SelectService select = new SelectService();

		List<User> user = select.authentication(user_id);

		Integer point = user.get(0).getPoint();

		session.setAttribute("point", point);

		request.getRequestDispatcher("/pointConfirm.jsp").forward(request, response);

	}
}
