package jp.co.axiz.servlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/AdminLogin")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
<<<<<<< HEAD
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");

		AdminInfoDao adminInfiDao = new AdminInfoDao();
		Admin admin = adminInfoDao.findByIdAndPassword(id, pass);
//Daoの完成によってメソッド名、変更あり！！

		if (admin != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", admin);
			response.sendRedirect(request.getContextPath() + "/AdminTop.jsp");
		} else {
			request.setAttribute("errmsg", "IDまたはPASSが間違っています");
			request.getRequestDispatcher("AdminLogin.jsp").forward(request, response);
		}
	}

=======
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String id = request.getParameter("id");
//		String pass = request.getParameter("pass");
//
//		AdminInfoDao adminInfiDao = new AdminInfoDao();
//		Admin admin = adminInfoDao.findByIdAndPassword(id, pass);
//
//		if (admin != null) {
//			HttpSession session = request.getSession();
//			session.setAttribute("user", admin);
//			response.sendRedirect(request.getContextPath() + "/AdminTop.jsp");
//		} else {
//			request.setAttribute("errmsg", "IDまたはPASSが間違っています");
//			request.getRequestDispatcher("AdminLogin.jsp").forward(request, response);
//		}
//	}
>>>>>>> branch 'master' of https://github.com/Takeda-Axiz/B_group_Project_Axiz.git
}
