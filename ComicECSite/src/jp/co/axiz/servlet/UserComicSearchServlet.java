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
import jp.co.axiz.service.ComicInfoService;

/**
 * Servlet implementation class UserComicSearchServlet
 */
@WebServlet("/UserComicSearch")
public class UserComicSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserComicSearchServlet() {
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

		String inputValue = null;
		List<JoinComicInfo> list = null;


		//id,name,telを取得
		String ca = (String)request.getParameter("select");
		int cate = Integer.parseInt(ca);

		inputValue = (String)request.getParameter("value");

		if(cate == 1) {
			String title = String.valueOf(cate);
			ComicInfoService cs = new ComicInfoService();
			list = cs.searchComicInfo(title,inputValue);
		}else if(cate == 2) {
			String author = String.valueOf(cate);
			ComicInfoService cs = new ComicInfoService();
			list = cs.searchComicInfo(author,inputValue);
		}else if(cate == 3) {
			String saleDay = String.valueOf(cate);
			ComicInfoService cs = new ComicInfoService();
			list = cs.searchComicInfo(saleDay,inputValue);
		}else if(cate == 4) {
			String publisher = String.valueOf(cate);
			ComicInfoService cs = new ComicInfoService();
			 list = cs.searchComicInfo(publisher,inputValue);
		}

		if(list.isEmpty()||list == null) {
			request.setAttribute("errmsg", "該当する作品がありません");
			request.getRequestDispatcher("index.jsp").forward(request, response);
			return;
		}
			session.setAttribute("serch", list);
			request.getRequestDispatcher("SerchResult.jsp").forward(request, response);
		}

}
