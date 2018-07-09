package jp.co.axiz.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.cookie.LoginCookie;

public class CartService {
	private HttpServletRequest request;
	private HttpServletResponse response;
	private String[] Products = null;
	String name = "userCart";
	Integer maxAge = -1;

	public CartService(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}

	public void addCart() {

		//～変数解説～
		//product…「カートに入れる」を押下したと時にgetParameterした漫画番号
		//products…今操作しているユーザーがカートに入れた漫画番号の塊

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

		//カンマごとに分割し、Stringの配列に格納する
		Products = products.split(",", 0);

		request.setAttribute("userCart", Products);

		LoginCookie.setCookie(request, response, name, products, maxAge);

	}

	public void removeCart(String comic_id) {

		String products = LoginCookie.getCookie(request, name);
		if(!(products.equals(null))) {
			Products = products.split(",", 0);
			String removeProduct = "";
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

