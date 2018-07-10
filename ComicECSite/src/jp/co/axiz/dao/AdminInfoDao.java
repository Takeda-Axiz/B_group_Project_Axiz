package jp.co.axiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.axiz.entity.AdminInfo;
import jp.co.axiz.util.DbUtil;

public class AdminInfoDao {

	private Connection connection;
	private static final String SQL_SELECT_WHERE_ADMIN_ID = "SELECT * FROM admin_info WHERE admin_id = ?";


	public AdminInfoDao() {
		connection = DbUtil.getConnection();
	}


	public List<AdminInfo> findByUserId(String adminId) {
		List<AdminInfo> list = new ArrayList<>();

		try(PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_WHERE_ADMIN_ID)) {
			stmt.setString(1, adminId);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				AdminInfo a = new AdminInfo(rs.getString("user_id"),
						rs.getString("admin_name"),
						rs.getString("admin_password"));
				list.add(a);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return list;

	}




}
