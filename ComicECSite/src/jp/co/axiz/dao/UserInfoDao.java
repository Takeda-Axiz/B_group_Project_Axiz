package jp.co.axiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	private static final String SQL_INSERT = "INSERT INTO user_info VALUES (?, ?, ?, ?, ?, 0, 0, ?, '1970-01-01 00:00:00', 0)";
	private static final String SQL_UPDATE = "UPDATE user_info SET delivery_user_id = ?, user_nanme = ?, password = ?, update_timestamp = ? WHERE delivery_user_id = ?";
	private static final String SQL_UPDATE_DELETE_FLG = "UPDATE user_info SET delete_flg = 1 WHERE delivery_user_id = ?";
	private static final String SQL_UPDATE_BALANCE = "UPDATE user_info SET balance = ? WHERE delivery_user_id = ?";
	private static final String SQL_UPDATE_POINT = "UPDATE user_info SET point = ? WHERE delivery_user_id = ?";

	public UserInfoDao() {
		connection = DbUtil.getConnection();
	}

	//DAOメソッド

	public List<UserInfo> findAll() {
		List<UserInfo> list = new ArrayList<>();

		try(PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_ALL)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				UserInfo u = new UserInfo(rs.getString("user_id"),
						rs.getString("deliv_user_id"),
						rs.getString("user_name"),
						rs.getString("password"),
						rs.getDate("birthday"),
						rs.getInt("balance"),
						rs.getInt("point"),
						rs.getString("insert_timestamp"),
						rs.getString("update__timestamp"),
						rs.getInt("deleteflg"));
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

		try(PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_WHERE_USER_ID)) {
			stmt.setString(1, userId);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				UserInfo u = new UserInfo(rs.getString("user_id"),
						rs.getString("deliv_user_id"),
						rs.getString("user_name"),
						rs.getString("password"),
						rs.getDate("birthday"),
						rs.getInt("balance"),
						rs.getInt("point"),
						rs.getString("insert_timestamp"),
						rs.getString("update__timestamp"),
						rs.getInt("deleteflg"));
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

		try(PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_WHERE_DELIVERY_USER_ID)) {
			stmt.setString(1, deliveryUserId);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				UserInfo u = new UserInfo(rs.getString("user_id"),
						rs.getString("delivery_user_id"),
						rs.getString("user_name"),
						rs.getString("password"),
						rs.getDate("birthday"),
						rs.getInt("balance"),
						rs.getInt("point"),
						rs.getString("insert_timestamp"),
						rs.getString("update_timestamp"),
						rs.getInt("delete_flg"));
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

		try(PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_WHERE_USER_ID_AND_PASSWORD)) {
			stmt.setString(1, userId);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				UserInfo u = new UserInfo(rs.getString("user_id"),
						rs.getString("deliv_user_id"),
						rs.getString("user_name"),
						rs.getString("password"),
						rs.getDate("birthday"),
						rs.getInt("balance"),
						rs.getInt("point"),
						rs.getString("insert_timestamp"),
						rs.getString("update__timestamp"),
						rs.getInt("deleteflg"));
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

		try(PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_WHERE_DELIVERY_USER_ID_AND_PASSWORD)) {
			stmt.setString(1, deliveryUserId);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				UserInfo u = new UserInfo(rs.getString("user_id"),
						rs.getString("deliv_user_id"),
						rs.getString("user_name"),
						rs.getString("password"),
						rs.getDate("birthday"),
						rs.getInt("balance"),
						rs.getInt("point"),
						rs.getString("insert_timestamp"),
						rs.getString("update__timestamp"),
						rs.getInt("deleteflg"));
				list.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return list;
	}

	public void insert(String userId, String userName, String password, String birthday, String timeStamp) {

		try(PreparedStatement stmt = connection.prepareStatement(SQL_INSERT)) {
			stmt.setString(1, userId);
			stmt.setString(2, userId);
			stmt.setString(3, userName);
			stmt.setString(4, password);
			stmt.setString(5, birthday);
			stmt.setString(6, timeStamp);
			stmt.executeUpdate();

		}catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public void update(String deliveryUserId, String userName, String password, String timeStamp, String loginUserId) {

		try(PreparedStatement stmt = connection.prepareStatement(SQL_UPDATE)) {
			stmt.setString(1, deliveryUserId);
			stmt.setString(2, userName);
			stmt.setString(3, password);
			stmt.setString(4, timeStamp);
			stmt.setString(5, loginUserId);
			stmt.executeUpdate();

		}catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public void updateDeleteFlg(String deliveryUserId) {

		try(PreparedStatement stmt = connection.prepareStatement(SQL_UPDATE_DELETE_FLG);) {
			stmt.setString(1, deliveryUserId);
			stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	public void updateBalance(String deliveryUserId, Integer balance) {

		try(PreparedStatement stmt = connection.prepareStatement(SQL_UPDATE_BALANCE)) {
			stmt.setString(1, deliveryUserId);
			stmt.setInt(2, balance);

		}catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

	public void updatePoint(String deliveryUserId, Integer point) {

		try(PreparedStatement stmt = connection.prepareStatement(SQL_UPDATE_POINT)) {
			stmt.setString(1, deliveryUserId);
			stmt.setInt(2, point);

		}catch(SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}

}
