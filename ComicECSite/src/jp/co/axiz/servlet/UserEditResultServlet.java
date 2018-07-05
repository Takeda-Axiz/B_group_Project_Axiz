package jp.co.axiz.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateConfirmServlet
 */
@WebServlet("/EditAccount")
public class UserEditResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserEditResultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String rePass = request.getParameter("rePass");

		HttpSession session = request.getSession();
		UserInfo afterUser = (UserInfo) session.getAttribute("afterUser");

		if (!afterUser.getPassword().equals(rePass)) {
			request.setAttribute("errmsg", "前画面で入力したパスワードと一致しません");
			request.getRequestDispatcher("updateConfirm.jsp").forward(request, response);
			return;
		}

		UserInfoDao userInfoDao = new UserInfoDao();
		userInfoDao.update(afterUser);

		session.removeAttribute("beforeUser");
		session.removeAttribute("afterUser");

		session.setAttribute("updateUserId", afterUser.getUserId());*/
		request.getRequestDispatcher("AccountResult.jsp").forward(request, response);
	}
}
