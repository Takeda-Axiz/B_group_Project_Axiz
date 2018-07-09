package jp.co.axiz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.entity.JoinComicInfo;

/**
 * Servlet implementation class AdminComicInfoServlet
 */
@WebServlet("/AdminComicInfo")
public class AdminComicInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminComicInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		HttpSession session= request.getSession();

		List<JoinComicInfo> list = null;

		//ComicInfoService c = new ComicInfoService();
		//List<JoinComicInfo> user = c.findAll();

		if(list.isEmpty()||list == null) {
			request.setAttribute("errmsg", "登録された漫画はありません。");
			request.getRequestDispatcher("AdminReference.jsp").forward(request, response);
			return;
		}else {

			session.setAttribute("comic", list);

			//次画面指定
			request.getRequestDispatcher("AdminReference.jsp").forward(request, response);
			return;
		}
	}

}
