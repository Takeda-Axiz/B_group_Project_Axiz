package jp.co.axiz.servlet;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();

		//ユーザー情報取得
		String user_id = (String) session.getAttribute("user_id");
		String delivery_user_id = (String) session.getAttribute("delivery_user_id");
		String user_name = (String) session.getAttribute("user_name");
		String password = (String) session.getAttribute("password");
		Date birthday = (Date) session.getAttribute("birthday");
		Integer balance = (Integer) session.getAttribute("balance");
		Integer point = (Integer) session.getAttribute("point");
		Timestamp insert_timestamp = (Timestamp) session.getAttribute("insert_timestamp");
		Timestamp update_timestamp = (Timestamp) session.getAttribute("update_timestamp");
		Integer delete_flg = (Integer) session.getAttribute("delete_flg");



		/*
		//SelectService selectService = new SelectService();

		//最新お勧め漫画を検索
		List<Comic> newComicListist = selectService.find();

		request.setAttribute("newComicList", newComicListist);

		//下記は会員限定機能
		//昔なつかし漫画

		if((user_id != null) && (!(user_id).equals("")){
			List<Comic> nostalgicComicList = selectService..authentication(birthday);

			session.setAttribute("nostalgicComicList", nostalgicComicList);

			boolean isSuccess = nostalgicComicList.size() != 0;

			if (isSuccess) {
				List<Charactor> nosList = selectService.findForBirthday(birthday);
				request.setAttribute("nosList", nosList);
			}

			session.setAttribute("user_id", user_id);
		}
		*/

	}

}
