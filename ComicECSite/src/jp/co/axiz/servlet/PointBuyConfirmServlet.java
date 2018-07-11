package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PointBuyResultServlet
 */
@WebServlet("PointResult")
public class PointBuyConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		//一時的にStringにしているだけ・・・
		String  beforePoint = request.getParameter("point");

		PointService pointService = new PointService();

		Integer afterPoint = pointService.point(beforePoint);

		HttpSession session = request.getSession();

		session.setAttribute("afterPoint", afterPoint);

		request.getRequestDispatcher("/pointResult.jsp").forward(request, response);

	}
}
