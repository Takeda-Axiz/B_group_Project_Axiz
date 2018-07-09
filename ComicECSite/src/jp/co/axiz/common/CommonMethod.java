package jp.co.axiz.common;

public class CommonMethod {

	/**
	 * 引数がnullかどうかを確認し、
	 * 引数がnullだった場合は空文字に変換する
	 *
	 * @param reset
	 * @return reset
	 */
	public static String resetNull(String reset) {
		if(reset == null) {
			reset = "";
		}
		return reset;
	}

	/**
	 * String型の変数を数値かどうか判断し、
	 * 数値の場合はInteger型に変換した値を戻し、
	 * 数値ではない場合はnullを戻す
	 *
	 * @param chgStr
	 *
	 * @return Integer.parseInt(chgStr)
	 * @return null
	 */
	public static Integer changeInteger(String chgStr) {
		Integer cntNum = 0;
		char[] chgStrChar = chgStr.toCharArray();

		for(char chgChar : chgStrChar) {
			if(Character.isDigit(chgChar)) {
				cntNum++;
			}
		}

		if(cntNum == chgStrChar.length) {
			return Integer.parseInt(chgStr);
		}else {
			return null;
		}
	}
}
