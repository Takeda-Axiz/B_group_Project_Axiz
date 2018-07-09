package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.service.UserComicInfoService;

/**
 * Servlet implementation class EvaluateServlet
 */
@WebServlet("/Evaluate")
public class EvaluateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EvaluateServlet() {
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
		//文字化け対策
		request.setCharacterEncoding("UTF-8");

		//セッションを取得
		HttpSession session = request.getSession();

		//評価内容取得
		String v = request.getParameter("valuation");
		int va = Integer.parseInt(v);

		//userComicIdの取得
		String user_comic_id = (String) session.getAttribute("qu_id");

		//評価の分岐
		if(va == 0) {
			request.setAttribute("msg", "評価を選択してください");
			request.getRequestDispatcher("Book001.jsp").forward(request, response);
			return;
		}

//		UserComicInfoDao ud = new UserComicInfoDao();
//		List<UserComicInfo> userComicInfo = ud.updata(user_comic_id,va);

		UserComicInfoService us = new UserComicInfoService(request);
		//List<UserComicInfo> userComicInfo = ud.updata(user_comic_id,va);

		if(va == 1) {
			request.setAttribute("msg", "評価:1");//評価：1 or va
			request.getRequestDispatcher("Book001.jsp").forward(request, response);
		}else if(va == 2) {
			request.setAttribute("msg", "評価:2");
			request.getRequestDispatcher("Book001.jsp").forward(request, response);
		}else if(va == 3) {
			request.setAttribute("msg", "評価:3");
			request.getRequestDispatcher("Book001.jsp").forward(request, response);
		}else if(va == 4) {
			request.setAttribute("msg", "評価:4");
			request.getRequestDispatcher("Book001.jsp").forward(request, response);
		}else if(va == 5) {
			request.setAttribute("msg", "評価:5");
			request.getRequestDispatcher("Book001.jsp").forward(request, response);
		}
	}

}
