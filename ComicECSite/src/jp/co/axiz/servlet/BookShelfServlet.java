package jp.co.axiz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.entity.JoinUserComicInfo;
import jp.co.axiz.service.UserComicInfoService;

/**
 * Servlet implementation class BookShelfServlet
 */
@WebServlet("/bookShelf")
public class BookShelfServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
//		HttpSession session = request.getSession();

		 UserComicInfoService uci = new  UserComicInfoService(request);
		 List<JoinUserComicInfo> list = uci.sort();

			request.setAttribute("userComicList", list);

		request.getRequestDispatcher("/bookSelect.jsp").forward(request, response);
	}
}
