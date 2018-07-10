package jp.co.axiz.servlet;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.common.CommonMethod;
import jp.co.axiz.service.ComicInfoService;

/**
 * Servlet implementation class AdminComicRegisterServlet
 */
@WebServlet("/AdminComicRegister")
public class AdminComicRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminComicRegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//リクエスト、レスポンス時の文字化け防止
		request.setCharacterEncoding("UTF-8");
		response.setContentType("index.jsp; charset=UTF-8");
		HttpSession session = request.getSession();

		// 変数宣言
		//フォームから入力された値を取得
		String title = request.getParameter("name");
		String strNumberOfTurns = request.getParameter("number_of_turns");
		Integer intNumberOfTurns;
		String category = request.getParameter("category");
		String strPrice = request.getParameter("price");
		Integer intPrice;
		String publisher = request.getParameter("publisher");
		String releaseDate = request.getParameter("release_date");
		String front = request.getParameter("front");
		String url = request.getParameter("URL");
		String author = request.getParameter("author");
		String summary = request.getParameter("summary");

		Boolean dateFlg = false;
		ComicInfoService cIS =new ComicInfoService();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = null;

		title = CommonMethod.resetNull(title);
		strNumberOfTurns = CommonMethod.resetNull(strNumberOfTurns);
		category = CommonMethod.resetNull(category);
		strPrice = CommonMethod.resetNull(strPrice);
		publisher = CommonMethod.resetNull(publisher);
		releaseDate = CommonMethod.resetNull(releaseDate);
		front = CommonMethod.resetNull(front);
		url = CommonMethod.resetNull(url);
		author = CommonMethod.resetNull(author);
		summary = CommonMethod.resetNull(summary);

		intPrice = CommonMethod.changeInteger(strPrice);
		intNumberOfTurns = CommonMethod.changeInteger(strNumberOfTurns);

		try {
			date = (Date) sdf.parse(releaseDate);
			dateFlg = true;
		} catch (ParseException e) {
			date = null;
		}

		if((title.isEmpty()) || (strNumberOfTurns.isEmpty()) ||
				(category.isEmpty()) || (strPrice.isEmpty()) ||
				(publisher.isEmpty()) || (front.isEmpty()) ||
				(url.isEmpty()) || (author.isEmpty())) {
			request.setAttribute("msg", "必須項目が未入力です。");
			request.getRequestDispatcher("ComicInsert.jsp").forward(request, response);
			return;
		}else {

			session.setAttribute("newtitle", title);
			session.setAttribute("newcategory", category);
			session.setAttribute("newprice", intPrice);
			session.setAttribute("newpublisher", publisher);
			session.setAttribute("newfront", front);
			session.setAttribute("newfront", url);
			if(dateFlg == true) {
				session.setAttribute("newrelease_date", releaseDate);
			}
			session.setAttribute("newauthor", author);
			session.setAttribute("newsummary", summary);

			//Daoの登録メソッド呼び出し
			cIS.insert(title,intNumberOfTurns,category,intPrice,publisher,front,url,date,author,summary);

			request.getRequestDispatcher("taskinsertResult.jsp").forward(request, response);
		}
	}
}
