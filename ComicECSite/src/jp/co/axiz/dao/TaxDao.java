package jp.co.axiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.axiz.entity.Tax;
import jp.co.axiz.util.DbUtil;

public class TaxDao {
	/*---  Field  ---*/
	private Connection connection;
	private static final String SQL_SELECT_ALL =
			"SELECT * FROM tax";
	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public TaxDao() {
		connection = DbUtil.getConnection();
	}
	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	public List<Tax> findAll() {
		// 変数宣言
		List<Tax>list = new ArrayList<Tax>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_ALL)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Tax tax = new Tax(
						rs.getInt("tax_id"),
						rs.getDouble("tax"),
						rs.getDate("introduction_date")
					);

				list.add(tax);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}
	/*---  Method End  ---*/
}
