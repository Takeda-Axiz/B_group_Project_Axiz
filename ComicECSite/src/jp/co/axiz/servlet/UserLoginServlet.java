package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.common.CommonMethod;
import jp.co.axiz.entity.UserInfo;
import jp.co.axiz.service.UserInfoService;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/Login")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 変数宣言
		String email = "";
		String pass = "";
		Boolean isSuccess = false;
		UserInfo login = null;
		UserInfoService uIS = null;
		HttpSession session = request.getSession();

		// 初期化

		// フォームから入力された値を取得
		email = request.getParameter("id");
		pass = request.getParameter("pass");

		email = CommonMethod.resetNull(email);
		pass = CommonMethod.resetNull(pass);

		//Serviceの呼び出し
		uIS= new UserInfoService();
		login = uIS.loginChack(email);
		isSuccess = (login == null);

		// 正しい入力がされていないときは『ログインできませんでした』を表示
		if(isSuccess) {

		}else if(pass.equals(login.getPassword())) {
			session.setAttribute("userLogin", login);

			// 次画面指定
			request.getRequestDispatcher("index.jsp").forward(request, response);
			return;
		}else {

		}
		request.setAttribute("msg", "ログインできませんでした。");

		request.getRequestDispatcher("login.jsp").forward(request, response);
		return;
	}
}
