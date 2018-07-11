package jp.co.axiz.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.dao.TaxDao;
import jp.co.axiz.entity.JoinComicInfo;
import jp.co.axiz.entity.Tax;
import jp.co.axiz.entity.UserInfo;

@WebServlet("/BuyCart")
public class BuyCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		request.setCharacterEncoding("UTF-8");

		boolean ret;
		Double tax = null;
		Integer sum = 0;
		Double TaxIncludedPrice = null;
		Integer taxIncludedPrice = null;

		UserInfo userInfo = (UserInfo) session.getAttribute("userLogin");
		Integer balance = userInfo.getBalance();

		List<JoinComicInfo> cartList = (List<JoinComicInfo>) session.getAttribute("userCart");

		TaxDao td = new TaxDao();
		List<Tax> taxList = td.findAll();
		Date date = new Date();

		for(int i = 0; i < taxList.size() ; i++) {
		Date taxDate = taxList.get(i).getIntroductionDate();
	    ret  = date.after(taxDate);
	    	if(ret ==true) {
	    		tax = taxList.get(i).getTax();
	    		break;
	    	}
		}

		for(int m = 0;m<cartList.size();m++) {
			Integer basePrice = cartList.get(m).getBasePrice();
			sum += basePrice;
		}
		TaxIncludedPrice = sum * tax;
		double i = TaxIncludedPrice.doubleValue();
		int ii = (int)i;
		taxIncludedPrice = Integer.valueOf(ii);

		session.setAttribute("userCart", cartList);
		session.setAttribute("balance", balance);
		session.setAttribute("priceSum",taxIncludedPrice);

		request.getRequestDispatcher("/Buy.jsp").forward(request, response);
	}
}
