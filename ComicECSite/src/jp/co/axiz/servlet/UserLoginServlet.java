package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.entity.UserInfo;

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
		String email;
		String pass;
		String setName;
		Boolean dao = false;
		UserInfo userInfo = new UserInfo();
		HttpSession session = request.getSession();

		email = request.getParameter("id");
		pass = request.getParameter("pass");

		if(dao/*()*/ == true) {
			setName = userInfo.getUserName();
			session.setAttribute("user", setName);
		}

		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
}
