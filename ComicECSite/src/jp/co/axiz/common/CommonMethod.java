package jp.co.axiz.common;

public class CommonMethod {

	public static String resetNull(String reset) {
		if(reset == null) {
			reset = "";
		}

		return reset;
	}
}
