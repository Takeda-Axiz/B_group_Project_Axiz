package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.entity.UserInfo;

/**
 * Servlet implementation class UserRegisterServlet
 */
@WebServlet("/UserRegister")
public class UserRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 基本doGetは使用しない
		throw new ServletException();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// doPost
		String userName = (String) request.getAttribute("user_name");
		String birthday = (String) request.getAttribute("birthday");
		String userId = (String) request.getAttribute("user_id");
		String password = (String) request.getAttribute("password");
		Boolean isErr = false;
		Boolean isNotRegist = false;
		UserInfo userInfo = new UserInfo();

		// ERRor MeSsaGe for Already Regist
		final String ERRMSG_AR = "すでに登録されています。";
		// ERRor MeSsaGe for Require Input
		final String ERRMSG_RI = "必須項目が入力されていません。";

		// ユーザ名
		if(userName == null || userName.isEmpty()) {
			request.setAttribute("errmsg", ERRMSG_RI);
			isErr = true;
		}

		// 生年月日
		if(birthday == null || birthday.isEmpty()) {
			request.setAttribute("errmsg", ERRMSG_RI);
			isErr = true;
		}

		// ユーザID(メールアドレス)
		if(userId == null || userId.isEmpty()) {
			request.setAttribute("errmsg", ERRMSG_RI);
			isErr = true;
		}

		// パスワード
		if(password == null || password.isEmpty()) {
			request.setAttribute("errmsg", ERRMSG_RI);
			isErr = true;
		}

		if(isErr == true) {
			request.getRequestDispatcher("/UserRegister.jsp").forward(request, response);
		}

		// DAOで登録済み確認
//		isNotRegist = dao(userId, userName, password, birthday);

		if(isNotRegist == true) {
			request.setAttribute("user_name", userInfo.getUserId());
			request.setAttribute("birthday", userInfo.getBirthday());
			request.setAttribute("user_id", userInfo.getUserId());

			request.getRequestDispatcher("/UserRegisterComfirm.jsp").forward(request, response);
		}else {
			request.setAttribute("user_name", userInfo.getUserId());
			request.setAttribute("birthday", userInfo.getBirthday());
			request.setAttribute("user_id", userInfo.getUserId());
			request.setAttribute("errmsg", ERRMSG_AR);

			request.getRequestDispatcher("/UserRegister.jsp").forward(request, response);
		}
	}
}
