package jp.co.axiz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.entity.JoinComicInfo;
import jp.co.axiz.service.ComicInfoService;

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
		List<JoinComicInfo> list = null;
		ComicInfoService cIS = new ComicInfoService();

		category = request.getParameter("category");
		search = request.getParameter("search");

		list = cIS.searchComicInfo(category, search);

		request.setAttribute("comicList", list);

		request.getRequestDispatcher("/AdminReference.jsp").forward(request, response);
	}
}
