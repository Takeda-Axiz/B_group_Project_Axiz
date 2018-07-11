package jp.co.axiz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.dao.UserInfoDao;
import jp.co.axiz.entity.UserInfo;

/**
 * Servlet implementation class MyPageServlet
 */
@WebServlet("/MyPage")
public class MyPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyPageServlet() {
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
		// TODO Auto-generated method stub
		//文字化け対策
		request.setCharacterEncoding("UTF-8");

		//セッションを取得
		HttpSession session = request.getSession();

		//セッションからインスタンス取得
		String deliveryUserId = (String)session.getAttribute("loginId");

		//IDチェック
		UserInfoDao userInfoDao = new UserInfoDao();
		List<UserInfo> userInfo = userInfoDao.findByDeliveryUserId(deliveryUserId);
		boolean isSuccess = (userInfo != null);

		//表示メッセージの受け渡し
		if (isSuccess && !(userInfo.isEmpty())) {
			int point = userInfo.get(0).getPoint();
			int charge = userInfo.get(0).getBalance();

			//ポイント・チャージ残高情報を取得
			request.setAttribute("point", point);
			request.setAttribute("charge", charge);
		}else {
			//メッセージ設定
			request.setAttribute("point", "0");
			request.setAttribute("charge", "0");
		}
		//次画面指定
		request.getRequestDispatcher("myPage.jsp").forward(request, response);
		return;
	}
}
