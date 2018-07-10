package jp.co.axiz.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BookShelfServlet
 */
@WebServlet("/bookShelf")
public class BookShelfServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();

		String userId = (String) session.getAttribute("user_id");

		SelectService selectService = new SelectService();

		//ユーザー漫画情報（中間テーブル）で検索をかける
		List<UserComic> userComicList = selectService.findForUserAndComic();

		Integer userComicId = userComicList.get(0).getUserComicId();
		String comicTitle = userComicList.get(0).getComicId().getComicTitle();
		String auhtorName = userComicList.get(0).getComicId().getAuthorName();
		String purchase = (String)userComicList.get(0).getPurchase_timestamp();
		String category = userComicList.get(0).getComicId().getCategoryId().getCategory();
		Integer numberOfTurns = userComicList.get(0).getComicId().getNumberOfTurns();

		//新しいリストにまとめる
		List<BookShelf> bookShelfList = new ArrayList<BookShelf>();

		bookShelfList.add(userComicId);
		bookShelfList.add(comicTitle);
		bookShelfList.add(auhtorName);
		bookShelfList.add(purchase);
		bookShelfList.add(category);
		bookShelfList.add(numberOfTurns);

		request.setAttribute("bookShelfList", bookShelfList);

		request.getRequestDispatcher("/bookSelect.jsp").forward(request, response);
	}
}
