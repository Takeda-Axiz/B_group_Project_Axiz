package jp.co.axiz.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.entity.ComicInfo;

/**
 * Servlet implementation class AdminReferenceServlet
 */
@WebServlet("/AdminReference")
public class AdminReferenceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminReferenceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
		String comicTitle;
		String authorName;
		Integer categoryId;
		Date releaseDate = Date.valueOf("2018-06-02");
		Integer publisherId;
		String select;  //カテゴリー検索の欄
		ComicInfo comicInfo = new ComicInfo();
		HttpSession session = request.getSession();

		comicTitle = request.getParameter("title");
		authorName = request.getParameter("name");
		categoryId = Integer.parseInt(request.getParameter("categoryId"));
		System.out.println(releaseDate);
		publisherId = Integer.parseInt(request.getParameter("publisherId"));
		select = request.getParameter("select");

		request.getRequestDispatcher("/AdminReference.jsp").forward(request, response);
	}

}
