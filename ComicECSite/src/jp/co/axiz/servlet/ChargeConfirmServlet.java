package jp.co.axiz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ChargeConfirmServlet
 */
@WebServlet("/ChargeConfirmServlet")
public class ChargeConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();

		String userName = (String) session.getAttribute("user_name");
		Integer addPoint = (Integer) session.getAttribute("addPoint");

		SelectService selectService = new Selectservice();

		List<User> list = selectService.findByName(userName);

		Integer beforePoint = list.get(0).getPoint();

		Integer afterPoint = beforePoint + addPoint;

		session.setAttribute("afterPoint", afterPoint);

		request.getRequestDispatcher("/ChargeResult.jsp").forward(request, response);

	}
}
