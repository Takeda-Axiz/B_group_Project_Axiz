package jp.co.axiz.cookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginCookie {;

	public static String getCookie(HttpServletRequest request, String name) {
		String products = null;

		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (name.equals(cookie.getName())) {
					products = cookie.getValue();
					break;
				}
			}
		}

		return products;
	}

	public static void setCookie(HttpServletRequest request, HttpServletResponse response, String name, String value, int maxAge) {
		Cookie cookie = new Cookie(name, value);
		cookie.setMaxAge(maxAge);
		//httpsで稼働している環境であればCookieが暗号化されるようSecure属性をつける
		if ("https".equals(request.getScheme())) {
			cookie.setSecure(true);
		}
		response.addCookie(cookie);
	}
}