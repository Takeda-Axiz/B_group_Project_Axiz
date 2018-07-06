package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.dao.ComicInfoDao;


/**
 * Servlet implementation class AdminComicDeleteServlet
 */
@WebServlet("/AdminComicDeleteServlet")
public class AdminComicDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminComicDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);

		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();

		String comicid = (String)request.getParameter("comic_id");
		Integer comic_id =Integer.parseInt(comicid);




		if (comicid == null || comicid.isEmpty()) {
			request.setAttribute("errmsg", "漫画IDを入力してください");
			request.getRequestDispatcher("ComicDelete.jsp").forward(request, response);
			return;
		}

		ComicInfoDao comicinfoDao = new ComicInfoDao();
		comicinfoDao.delete(Integer.parseInt(comicid));

		request.getRequestDispatcher("ComicDeleteResult.jsp").forward(request, response);
	}
}
