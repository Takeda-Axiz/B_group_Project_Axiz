package jp.co.axiz.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import jp.co.axiz.entity.UserInfo;
import jp.co.axiz.util.DbUtil;

public class UserInfoDao {

	private Connection connection;
	private static final String SQL_SELECT_ALL = "SELECT * FROM user_info";
	private static final String SQL_SELECT_WHERE_USER_ID = "SELECT * FROM user_info WHERE user_id = ?";
	private static final String SQL_SELECT_WHERE_DELIVERY_USER_ID = "SELECT * FROM user_info WHERE delivery_user_id = ?";
	private static final String SQL_SELECT_WHERE_USER_ID_AND_PASSWORD = "SELECT * FROM user_info WHERE user_id = ? AND password = ?";
	private static final String SQL_SELECT_WHERE_DELIVERY_USER_ID_AND_PASSWORD = "SELECT * FROM user_info WHERE delivery_user_id = ? AND password = ?";
	private static final String SQL_INSERT = "INSERT INTO user_info VALUES (?, '0', ?, ?, ?, 0, 0, ?, '1970-01-01 00:00:00', 1)";
	private static final String SQL_UPDATE = "UPDATE user_info SET delivery_user_id = ?, user_nanme = ?, password = ?, birthday = ?, update_timestamp = ?";
	private static final String SQL_UPDATE_DELETE_FLG = "UPDATE user_info SET delete_flg = 0 WHERE delivery_user_id = ?";
	private static final String SQL_UPDATE_BALANCE = "UPDATE user_info SET balance = ? WHERE delivery_user_id = ?";
	private static final String SQL_UPDATE_POINT = "UPDATE user_info SET point = ? WHERE delivery_user_id = ?";

	public UserInfoDao() {
		connection = DbUtil.getConnection();
	}

	//DAOメソッド

	//上から 全件、userIdのみ、deliveryUserIdのみ、userIdとPASS、deliveryUserIdとPASS

	public List<UserInfo> findAll() {
		List<UserInfo> list = new ArrayList<>();

		try {
			PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_ALL);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				UserInfo u = new UserInfo(rs.getString("user_id"),rs.getString("deliv_user_id"), rs.getString("user_name"), rs.getString("password"), rs.getDate("birthday"), rs.getInt("balance"), rs.getInt("point"), rs.getString("insert_timestamp"), rs.getString("update__timestamp"), rs.getInt("deleteflg"));
				list.add(u);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return list;

	}

	public List<UserInfo> findByUserId(String userId) {
		List<UserInfo> list = new ArrayList<>();

		try {
			PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_WHERE_USER_ID);
			stmt.setString(1, userId);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				UserInfo u = new UserInfo(rs.getString("user_id"),rs.getString("deliv_user_id"), rs.getString("user_name"), rs.getString("password"), rs.getDate("birthday"), rs.getInt("balance"), rs.getInt("point"), rs.getString("insert_timestamp"), rs.getString("update__timestamp"), rs.getInt("deleteflg"));
				list.add(u);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return list;

	}

	public List<UserInfo> findByDeliveryUserId(String deliveryUserId) {
		List<UserInfo> list = new ArrayList<>();

		try {
			PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_WHERE_DELIVERY_USER_ID);
			stmt.setString(1, deliveryUserId);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				UserInfo u = new UserInfo(rs.getString("user_id"),rs.getString("deliv_user_id"), rs.getString("user_name"), rs.getString("password"), rs.getDate("birthday"), rs.getInt("balance"), rs.getInt("point"), rs.getString("insert_timestamp"), rs.getString("update__timestamp"), rs.getInt("deleteflg"));
				list.add(u);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return list;

	}

	public List<UserInfo> findByUserIdAndPassword(String userId, String password) {
		List<UserInfo> list = new ArrayList<>();

		try {
			PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_WHERE_USER_ID_AND_PASSWORD);
			stmt.setString(1, userId);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				UserInfo u = new UserInfo(rs.getString("user_id"),rs.getString("deliv_user_id"), rs.getString("user_name"), rs.getString("password"), rs.getDate("birthday"), rs.getInt("balance"), rs.getInt("point"), rs.getString("insert_timestamp"), rs.getString("update__timestamp"), rs.getInt("deleteflg"));
				list.add(u);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return list;

	}

	public List<UserInfo> findByDeliveryUserIdAndPassword(String deliveryUserId, String password) {
		List<UserInfo> list = new ArrayList<>();

		try {
			PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_WHERE_DELIVERY_USER_ID_AND_PASSWORD);
			stmt.setString(1, deliveryUserId);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				UserInfo u = new UserInfo(rs.getString("user_id"),rs.getString("deliv_user_id"), rs.getString("user_name"), rs.getString("password"), rs.getDate("birthday"), rs.getInt("balance"), rs.getInt("point"), rs.getString("insert_timestamp"), rs.getString("update__timestamp"), rs.getInt("deleteflg"));
				list.add(u);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return list;

	}

	//サービスメソッド

	/*
	 * 上から 登録、更新、退会、
	 * 金額チャージ、残高チェック、金額消費、
	 * ポイント付与、ポイント消費
	 */

	public boolean register(String userId, String userName, String password, Date birthday) {

		//<注意>　配信メールアドレスと重複しているものはfalseを返す
		try {
			List<UserInfo> list = findByDeliveryUserId(userId);
			list.get(0);
			return false;
		}catch(Exception e) {}
		//同じメールアドレスが初期メールアドレスカラムにないか探す
		try {
			List<UserInfo> list = findByUserId(userId);
			list.get(0);
			return false;
		}catch(Exception e) {}

		//現在日時を変数timeStampに代入
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String timeStamp = dtf.format(ldt);

		try {
			PreparedStatement stmt = connection.prepareStatement(SQL_INSERT);
			stmt.setString(1, userId);
			stmt.setString(2, userName);
			stmt.setString(3, password);
			stmt.setDate(4, birthday);
			stmt.setString(5, timeStamp);
			stmt.executeUpdate();


		}catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return true;

	}

	public void update(String deliveryUserId, String userName, String password, Date birthday) {

		//現在日時を変数timeStampに代入
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String timeStamp = dtf.format(ldt);

		try {
			PreparedStatement stmt = connection.prepareStatement(SQL_UPDATE);
			stmt.setString(1, deliveryUserId);
			stmt.setString(2, userName);
			stmt.setString(3, password);
			stmt.setDate(4, birthday);
			stmt.setString(5, timeStamp);
			stmt.executeUpdate();


		}catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	public void unSubscribe(String deliveryUserId) {

		try {
			PreparedStatement stmt = connection.prepareStatement(SQL_UPDATE_DELETE_FLG);
			stmt.setString(1, deliveryUserId);
			stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	public void moneyCharge(String deliveryUserId, Integer chargeMoney) {

		//残高を参照
		List<UserInfo> list = findByDeliveryUserId(deliveryUserId);
		UserInfo user = list.get(0);
		Integer balance = user.getBalance();
		//残高にお金をチャージ
		balance += chargeMoney;

		try {
			PreparedStatement stmt = connection.prepareStatement(SQL_UPDATE_BALANCE);
			stmt.setString(1, deliveryUserId);
			stmt.setInt(2, balance);

		}catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	public void moneyUse(String deliveryUserId, Integer Treasurer) {

		//残高を参照
		List<UserInfo> list = findByDeliveryUserId(deliveryUserId);
		UserInfo user = list.get(0);
		Integer balance = user.getBalance();
		//残高から会計分のお金を引く
		balance -= Treasurer;

		try {
			PreparedStatement stmt = connection.prepareStatement(SQL_UPDATE_BALANCE);
			stmt.setString(1, deliveryUserId);
			stmt.setInt(2, balance);

		}catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	public void pointCharge(String deliveryUserId, Integer chargePoint) {

		//ポイント残高を参照
		List<UserInfo> list = findByDeliveryUserId(deliveryUserId);
		UserInfo user = list.get(0);
		Integer point = user.getPoint();
		//ポイント残高にポイントを追加
		point += chargePoint;

		try {
			PreparedStatement stmt = connection.prepareStatement(SQL_UPDATE_POINT);
			stmt.setString(1, deliveryUserId);
			stmt.setInt(2, point);

		}catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	public void pointUse() {



	}

}
