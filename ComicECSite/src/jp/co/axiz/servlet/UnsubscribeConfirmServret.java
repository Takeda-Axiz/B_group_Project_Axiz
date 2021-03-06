package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.entity.UserInfo;
import jp.co.axiz.service.UserInfoService;

/**
 * Servlet implementation class UnsubscribeConfirmServret
 */
@WebServlet("/UnsubscribeConfirm")
public class UnsubscribeConfirmServret extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UnsubscribeConfirmServret() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//文字化け対策
		request.setCharacterEncoding("UTF-8");

		//セッションを取得
		HttpSession session = request.getSession();

		//セッションからインスタンス取得
		UserInfo userData = (UserInfo)session.getAttribute("userdata");
		String deliveryUserId = userData.getDeliveryUserId();
		session.setAttribute("user_id", deliveryUserId);

		UserInfoService userInfoService = new UserInfoService(request);
		userInfoService.unSubscribe();

		//次画面指定
		request.getRequestDispatcher("UnsubscribeResult.jsp").forward(request, response);
		return;
	}
}
