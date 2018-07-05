package jp.co.axiz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminComicSearchServlet
 */
@WebServlet("/AdminComicSearch")
public class AdminComicSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminComicSearchServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 基本doGetは使用しない
		throw new ServletException();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// doPost
		String category;
		String search;
		List list = null;

		category = request.getParameter("Category");
		search = request.getParameter("search");

		switch(category) {
		case "title":
//			list = dao(search);
			break;
		case "author":
//			list = dao(search);
			break;
		case "category":
//			list = dao(search);
			break;
		case "saleDay":
//			list = dao(search);
			break;
		case "publisher":
//			list = dao(search);
			break;
		default:
			throw new ServletException();
		}

		request.setAttribute("comicList", list);

		request.getRequestDispatcher("/AdminReference.jsp").forward(request, response);
	}
}
