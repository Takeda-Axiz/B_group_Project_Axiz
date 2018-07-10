package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.dao.UserInfoDao;
import jp.co.axiz.entity.UserInfo;
import jp.co.axiz.service.UserInfoService;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/login")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String email;
		String pass;
		String setName;
		Boolean dao = false;
		UserInfo userInfo = new UserInfo();
		HttpSession session = request.getSession();


		//フォームから入力された値を取得
		email = request.getParameter("id");
		pass = request.getParameter("pass");


		//Serviceの呼び出し
		UserInfoService userinfoservice= new UserInfoService();
		UserInfo login = userinfoservice.authentication(email, pass);
		boolean isSuccess = login == null;

		//何も入力されていないときは『ログインできませんでした』を表示
		if(isSuccess) {
			request.setAttribute("msg", "ログインできませんでした。");

			request.getRequestDispatcher("Login.jsp").forward(request, response);
			return;
		}

		session.setAttribute(LoginUser, );

		//次画面指定
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
}
