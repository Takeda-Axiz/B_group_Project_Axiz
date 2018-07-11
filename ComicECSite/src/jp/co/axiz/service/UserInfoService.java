package jp.co.axiz.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jp.co.axiz.dao.UserInfoDao;
import jp.co.axiz.entity.UserInfo;

public class UserInfoService {

	UserInfo user;
	UserInfoDao uid = new UserInfoDao();
	HttpServletRequest request;
//	HttpSession session = request.getSession();
	String deliveryUserId;
	String userName;
	String birthday;
	String password;
	String timeStamp;
	String chargeMoney;
	String useMoney;
	String chargePoint;
	String usePoint;

	/*---  Constructor  ---*/
	//  処理概要
	public UserInfoService() {
	}

	public UserInfoService(HttpServletRequest request) {
		this.request = request;

		//現在日時を変数timeStampに代入
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		timeStamp = dtf.format(ldt);
	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	//  処理概要
	public boolean register() {
		deliveryUserId = request.getParameter("user_id");
		userName = request.getParameter("user_name");
		birthday = request.getParameter("birthday");
		password = request.getParameter("password");

		//配信メールアドレスと重複しているものはfalseを返す
		try {
			List<UserInfo> list = uid.findByDeliveryUserId(deliveryUserId);
			list.get(0);
			return false;
		}catch(Exception e) {}

		uid.insert(deliveryUserId, userName, password, birthday, timeStamp);

		return true;
	}

//		public void update() {
//			deliveryUserId = request.getParameter("user_id");
//			userName = request.getParameter("user_name");
//			password = request.getParameter("password");
//
//			//ログインしたユーザーの情報をで取得
//			String loginUserId = (String) session.getAttribute("loginUser");
//
//			uid.update(userId, userName, password, birthday, timeStamp, loginUserId);
//		}

	public void unSubscribe() {
		deliveryUserId = request.getParameter("user_id");

		uid.updateDeleteFlg(deliveryUserId);
	}

	public void moneyCharge() {
		deliveryUserId = request.getParameter("user_id");
		chargeMoney = request.getParameter("chargeMoney");
		Integer ChargeMoney = Integer.parseInt(chargeMoney);

		//残高を参照
		List<UserInfo> list = uid.findByDeliveryUserId(deliveryUserId);
		UserInfo user = list.get(0);
		Integer balance = user.getBalance();
		//残高にお金をチャージ
		balance += ChargeMoney;

		uid.updateBalance(deliveryUserId, balance);
	}

	public void moneyUse(String deliveryUserId, Integer afterBalance) {
		uid.updateBalance(deliveryUserId, afterBalance);
	}

	public void pointCharge() {
		deliveryUserId = request.getParameter("user_id");
		chargePoint = request.getParameter("chargePoint");
		Integer ChargePoint = Integer.parseInt(chargePoint);

		//ポイント残高を参照
		List<UserInfo> list = uid.findByDeliveryUserId(deliveryUserId);
		UserInfo user = list.get(0);
		Integer point = user.getPoint();
		//ポイント残高にポイントをチャージ
		point += ChargePoint;

		uid.updatePoint(deliveryUserId, point);
	}

	public void pointUse() {
		deliveryUserId = request.getParameter("user_id");
		usePoint = request.getParameter("usePoint");
		Integer UsePoint = Integer.parseInt(usePoint);

		//ポイント残高を参照
		List<UserInfo> list = uid.findByDeliveryUserId(deliveryUserId);
		UserInfo user = list.get(0);
		Integer point = user.getPoint();
		//ポイント残高にポイントをチャージ
		point += UsePoint;

		uid.updatePoint(deliveryUserId, point);
	}

	public UserInfo loginChack(String userId) {
		List<UserInfo> list = null;

		list = uid.findByDeliveryUserId(userId);

		if(list.isEmpty()) {
			return null;
		}else {
			return list.get(0);
		}
	}
}
