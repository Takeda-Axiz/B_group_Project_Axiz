package jp.co.axiz.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelectServlet
 */
@WebServlet("/select")
public class BrowsingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public BrowsingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String viewPage = request.getParameter("viewPage");
		String imageDate = request.getParameter("imageDate");
		Integer comicId = Integer.parseInt(request.getParameter("comicId"));

	/*	ComicInfo cond = new ComicInfo();
		try {
			cond.setId(Integer.parseInt(comicId));
		} catch (NumberFormatException e) {
			// do nothing
		}
		cond.setName(name);
		cond.setTelephone(tel);

		ComicInfoDao ComicInfoDao = new ComicInfoDao();
		List<ComicInfo> list = comicInfoDao.find(cond);

		if (list.isEmpty()) {
			request.setAttribute("errmsg", "入力されたデータはありませんでした");
			request.getRequestDispatcher("select.jsp").forward(request, response);
		} else {
			request.setAttribute("userlist", list);
		*/	request.getRequestDispatcher(".jsp").forward(request, response);
		}
	}
