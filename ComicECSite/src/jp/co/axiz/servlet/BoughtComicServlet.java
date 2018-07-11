package jp.co.axiz.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.common.CommonMethod;
import jp.co.axiz.entity.ComicInfo;
import jp.co.axiz.service.ComicInfoService;

/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/BookSelect")
public class BoughtComicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BoughtComicServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String comicId = request.getParameter("comicId");

		CommonMethod.changeInteger(comicId);

		ComicInfoService cis = new ComicInfoService();
		ComicInfo comicInfo = cis.findComicInfo(CommonMethod.changeInteger(comicId));

		request.setAttribute("bookShelf", comicInfo);

		request.getRequestDispatcher("ShelfBook.jsp").forward(request, response);
	}
}
