package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.dao.JoinComicInfoDao;


/**
 * Servlet implementation class AdminUpdateComic
 */
@WebServlet("/AdminUpdateComic")
public class AdminComicUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminComicUpdateServlet() {
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

		//漫画タイトル
		String comicTitle = request.getParameter("comicTitle");//

		//カテゴリー
		String categoryName = request.getParameter("categoryName");

		//本体価格
		String basePrice = (String)request.getParameter("basePrice");
		Integer baseprice =Integer.parseInt(basePrice);

		//Integer basePrice =Integer.valueOf(request.getParameter("basePrice"));

		//出版社
		String publisherName = request.getParameter("publisherName");

		//表紙画像
		String imageData = request.getParameter("imageData");


		//Date releaseDate = request.getParameter("releaseDate ");
		// Date releaseDate = Integer.valueOf (request.getParameter("releaseDate "));
		//発売日
		String relesedate = (String)request.getParameter("releaseDate");
//		Date date = (Date) new SimpleDateFormat("yyyy/MM/dd").parse(relesedate);

		//原作者
		String authorName = request.getParameter("authorName");

		//巻数
		String number_of_turns =request.getParameter("number_of_turns");
		Integer NumberofTurns =Integer.parseInt(number_of_turns);


		try{
			JoinComicInfoDao joincomicinfoDao = new JoinComicInfoDao();
//			joincomicinfoDao.update(comicTitle,categoryName,basePrice,publisherName,imageData,relesedate,authorName,number_of_turns);
			request.getRequestDispatcher("ComicUpdateResult.jsp").forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
