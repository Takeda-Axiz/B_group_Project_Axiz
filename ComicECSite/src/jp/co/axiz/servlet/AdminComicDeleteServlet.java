package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.common.CommonMethod;
import jp.co.axiz.service.ComicInfoService;


/**
 * Servlet implementation class AdminComicDeleteServlet
 */
@WebServlet("/AdminComicDelete")
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
		String comicStrId;
		Integer comicIntId;
		ComicInfoService cIS = new ComicInfoService();

		request.setCharacterEncoding("UTF-8");

		comicStrId = (String)request.getParameter("comic_id");
		comicStrId = CommonMethod.resetNull(comicStrId);

		if (comicStrId.isEmpty()) {
			request.setAttribute("errmsg", "漫画IDを入力してください");
			request.getRequestDispatcher("AdminSelect.jsp").forward(request, response);
			return;
		}

		comicIntId = CommonMethod.changeInteger(comicStrId);

		if(comicIntId == null) {
			request.setAttribute("errmsg", "正しい漫画IDを入力してください");
			request.getRequestDispatcher("AdminSelect.jsp").forward(request, response);
			return;
		}
		cIS.deleteComicInfo(comicIntId);

		request.getRequestDispatcher("ComicDeleteResult.jsp").forward(request, response);
		return;
	}
}
