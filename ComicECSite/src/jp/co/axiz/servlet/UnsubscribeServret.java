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
 * Servlet implementation class UnsubscribeServret
 */
@WebServlet("/Unsubscribe")
public class UnsubscribeServret extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UnsubscribeServret() {
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

		//入力内容取得
		String id = request.getParameter("id");

		//入力値のチェック
		if ("".equals(id)|| id ==null){

			//メッセージ設定
			request.setAttribute("errmsg", "会員IDを入力してください");

			//次画面指定
			request.getRequestDispatcher("Unsubscribe.jsp").forward(request, response);
			return;
		}

		//IDチェック
		UserInfoDao userInfoDao = new UserInfoDao();
		List<UserInfo> userInfo = userInfoDao.findByDeliveryUserId(id);
		boolean isSuccess = userInfo != null;

		//表示メッセージの受け渡し
		if (isSuccess) {

			//ログイン情報を取得
			session.setAttribute("userdata", userInfo);

			//次画面指定
			request.getRequestDispatcher("UnsubscribeConfirm.jsp").forward(request, response);
			return;
		}else {
			//メッセージ設定
			request.setAttribute("errmsg", "入力されたデータは存在しません");

			//次画面指定
			request.getRequestDispatcher("Unsubscribe.jsp").forward(request, response);
		}
	}
}
