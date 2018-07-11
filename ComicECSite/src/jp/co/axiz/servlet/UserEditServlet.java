package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.common.CommonMethod;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/UserEdit")
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

//		UserInfo userInfo = new UserInfo();

//		userInfo.setuserId(userId);
//		userInfo.setuserName(userName);
//		userInfo.setpassword(pass);

//		HttpSession session = request.getSession();
//		session.setAttribute("registerUser", userInfo);

		userId = CommonMethod.resetNull(userId);
		userName = CommonMethod.resetNull(userName);
		pass = CommonMethod.resetNull(pass);

		if (userId.isEmpty() || userName.isEmpty() || pass == null || pass.isEmpty()) {
			request.setAttribute("errmsg", "未入力の項目があります");
			request.getRequestDispatcher("insert.jsp").forward(request, response);
			return;
		}else {
//			UserInfoService 　　　 =new UserInfoService(request);
//			AdminInfo admin = 　　　.　　　(　　　);
		}
	}
}
