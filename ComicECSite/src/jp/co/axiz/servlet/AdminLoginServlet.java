package jp.co.axiz.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.entity.AdminInfo;

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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id;
		String pass;
		String setName;
		Boolean dao = false;
		AdminInfo adminInfo = new AdminInfo();
		HttpSession session = request.getSession();

		id = request.getParameter("id");
		pass = request.getParameter("pass");

		if(dao/*()*/ == true) {
			setName = adminInfo.getAdminName();
			session.setAttribute("user", setName);
		}

		request.getRequestDispatcher("/AdminTop.jsp").forward(request, response);
	}
}

