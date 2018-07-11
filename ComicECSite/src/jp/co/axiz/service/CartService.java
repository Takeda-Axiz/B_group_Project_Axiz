package jp.co.axiz.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.common.CommonMethod;
import jp.co.axiz.cookie.LoginCookie;
import jp.co.axiz.dao.JoinComicInfoDao;
import jp.co.axiz.entity.JoinComicInfo;

public class CartService {
	//～Cookie解説～
	//CookieはStringしか格納できない。そのため、文字列に漫画番号の塊を格納し、Cookieに渡して管理している
	//カート画面で表示する時と、文字列から特定の文字を削除する時用にString配列を使用している

	//～変数解説～
	//product…「カートに入れる」を押下したと時にgetParameterした漫画番号
	//products…今操作しているユーザーがカートに入れた漫画番号の塊

	private HttpServletRequest request;
	private HttpServletResponse response;
	String name = "userCart";
	Integer maxAge = -1;

	public CartService(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}

	public void showCart() {
		HttpSession session = request.getSession();
		String[] Products;
		String products = LoginCookie.getCookie(request, name);
		Products = products.split(",", 0);
		JoinComicInfoDao jcid = new JoinComicInfoDao();
		List<JoinComicInfo> list = new ArrayList<>();

		for(String produtNumber:Products) {
			Integer ProdutNumber = CommonMethod.changeInteger(produtNumber);
			JoinComicInfo record = jcid.findByComicId(ProdutNumber);
			list.add(record);
		}
		session.setAttribute("userCart", list);
	}

	public void addCart() {

		//カートに入れるを押下された時の商品番号を取得する
		String product = request.getParameter("product");

		//Cookieに入っている、商品一覧がカンマ区切りで入っているStringを取得する
		String products = LoginCookie.getCookie(request, name);
		//カンマ区切りで結合、中身がnullだった場合はそのまま入れる
		if(products.equals(null)) {
			products = product;
		}else {
			products = products + "," + product;
		}

		LoginCookie.setCookie(request, response, name, products, maxAge);

	}

	public void removeCart(String comic_id) {
		String[] Products;

		String products = LoginCookie.getCookie(request, name);
		if(!(products.equals(null))) {
			Products = products.split(",", 0);
			String removeProduct = "";
			//
			for(String i : Products) {
				if(i.equals(comic_id)) {
					removeProduct = i;
					break;
				}
			}
			Products = remove(Products, removeProduct);
			products = String.join(",", Products);
			LoginCookie.setCookie(request, response, name, products, maxAge);
		}else {
			products = "";
			return;
		}
	}

	//String配列の要素削除用のメソッド
	private static String[] remove(String[] target, String removeStr) {
		List<String> temp = new ArrayList<>(Arrays.asList(target));
		temp.remove(removeStr);
		return temp.toArray(new String[0]);
	}

}