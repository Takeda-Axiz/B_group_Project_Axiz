package jp.co.axiz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.cookie.LoginCookie;
import jp.co.axiz.entity.JoinComicInfo;
import jp.co.axiz.entity.UserInfo;
import jp.co.axiz.service.UserComicInfoService;
import jp.co.axiz.service.UserInfoService;

/**
 * Servlet implementation class BuyCartConfirmServlet
 */
@WebServlet("/buyCartConfirm")
public class BuyCartConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession();

		//カート情報取得
		List<JoinComicInfo> cartList = (List<JoinComicInfo>) session.getAttribute("userCart");
		//ユーザー情報取得
		UserInfo userInfo = (UserInfo) session.getAttribute("userLogin");

		//残高情報を取得
		Integer balance = userInfo.getBalance();
		//初期メールアドレスを取得
		String userId = userInfo.getUserId();
		//配信メールアドレスを取得
		String deliveryUserId = userInfo.getDeliveryUserId();

		UserComicInfoService ucis = new UserComicInfoService(request);

		Integer priceSum = (Integer) session.getAttribute("priceSum");

		if (balance < priceSum) {
			request.setAttribute("errmsg", "残高不足です。マイページでチャージを行ってから購入してください。");

			request.getRequestDispatcher("/Buy.jsp").forward(request, response);
		} else {
			Integer afterBalance = balance - priceSum;

			//カートテーブル内の情報を本棚テーブルに登録
			for(int i = 0; i < cartList.size(); i++) {
				ucis.insertComic(userId, cartList.get(i).getComicId());
			}

			//カート内の情報を削除(Cookie)
			LoginCookie.removeCookie(response, "userCart");

			//残高の更新
			UserInfoService uis = new UserInfoService();
			uis.moneyUse(deliveryUserId, afterBalance);

			request.getRequestDispatcher("BuyConfirm.jsp").forward(request, response);
		}

	}

}
