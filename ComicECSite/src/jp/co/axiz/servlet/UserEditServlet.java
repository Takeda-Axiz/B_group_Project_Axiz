package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.entity.UserInfo;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/Mypage")
public class UserEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("id");
		String userName = request.getParameter("name");
		String pass = request.getParameter("pass");

		UserInfo userInfo = new UserInfo();

	/*	userInfo.setuserId(userId);
		userInfo.setuserName(userName);
		userInfo.setpassword(pass);

		HttpSession session = request.getSession();
		session.setAttribute("registerUser", userInfo);

		if (name == null || name.isEmpty()) {
			request.setAttribute("errmsg", "名前は必須です");
			request.getRequestDispatcher("insert.jsp").forward(request, response);
			return;
		}

		if (tel == null || tel.isEmpty()) {
			request.setAttribute("errmsg", "TELは必須です");
			request.getRequestDispatcher("insert.jsp").forward(request, response);
			return;
		}

		if (pass == null || pass.isEmpty()) {
			request.setAttribute("errmsg", "PASSは必須です");
			request.getRequestDispatcher("insert.jsp").forward(request, response);
			return;
		}*/

		request.getRequestDispatcher("EditAccount.jsp").forward(request, response);
	}
}
