package jp.co.axiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import jp.co.axiz.util.DbUtil;

public class UserComicInfoDao {

	private Connection connection;
	private static final String SQL_INSERT = "INSERT INTO user_comic_info(user_id, comic_id, individual_evaluation, purchase_timestamp, delete_flg) VALUES (?, ?, 0, ?, 0)";
	private static final String SQL_UPDATE_DELETE_FLG = "UPDATE user_comic_info SET delete_flg = 1 WHERE user_id = ?";

	public UserComicInfoDao() {
		connection = DbUtil.getConnection();
	}

	public void insert(String userId, Integer comicId, Timestamp purchaseTimestamp) {
		try(PreparedStatement stmt = connection.prepareStatement(SQL_INSERT)) {
			stmt.setString(1, userId);
			stmt.setInt(2, comicId);
			stmt.setTimestamp(3, purchaseTimestamp);
			stmt.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public void logicalDelete (String userId) {
		try(PreparedStatement stmt = connection.prepareStatement(SQL_UPDATE_DELETE_FLG)) {
			stmt.setString(1, userId);
			stmt.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
