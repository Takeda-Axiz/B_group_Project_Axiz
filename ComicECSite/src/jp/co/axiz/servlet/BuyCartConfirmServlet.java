package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BuyCartConfirmServlet
 */
@WebServlet("/BuyCartConfirmServlet")
public class BuyCartConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
/*
		HttpSession session = request.getSession();

		//カート情報取得
		List<Cart> list = (List<Cart>) session.getAttribute("cartList");

		InsertService insertService = new InsertService();

		//残高情報を取得
		Integer balance = User.getBalance();

		//小計を出す
		Integer total = insertService.total(list);

		if(balance < total) {
			request.setAttribute("msg", "残高不足です。マイページからチャージを行ってから購入してください。");

			request.getRequestDispatcher("buy.jsp").forward(request, response);
		}else {
			Integer afterBalance = balance - total ;

			//カートテーブル内の情報を本棚テーブルに登録
			insertService.buyCart(list);

			DeleteService deleteService = new DeleteService();

			//カート内の情報を削除
			deleteService.delete(list);

			session.setAttribute("afterBalance", afterBalance);

			request.getRequestDispatcher("buyConfirm.jsp").forward(request, response);
		}

*/

	}

}
