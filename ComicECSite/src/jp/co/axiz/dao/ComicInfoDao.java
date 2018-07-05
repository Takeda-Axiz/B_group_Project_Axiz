package jp.co.axiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.axiz.entity.ComicInfo;
import jp.co.axiz.util.DbUtil;

public class ComicInfoDao {
	/*---  Field  ---*/
	private Connection connection;
	private static final String SQL_SELECT_ALL = "SELECT * FROM comic_info";
	//	private static final String SQL_SELECT_WHERE_USER_ID = "SELECT * FROM comic_info WHERE user_id = ?";
	//	private static final String SQL_SELECT_WHERE_DELIVERY_USER_ID = "SELECT * FROM comic_info WHERE delivery_user_id = ?";
	//	private static final String SQL_SELECT_WHERE_USER_ID_AND_PASSWORD = "SELECT * FROM comic_info WHERE user_id = ? AND password = ?";
	//	private static final String SQL_SELECT_WHERE_DELIVERY_USER_ID_AND_PASSWORD = "SELECT * FROM comic_info WHERE delivery_user_id = ? AND password = ?";
	//	private static final String SQL_INSERT = "INSERT INTO comic_info VALUES (?, '0', ?, ?, ?, 0, 0, ?, '1970-01-01 00:00:00', 1)";
	//	private static final String SQL_UPDATE = "UPDATE comic_info SET delivery_user_id = ?, user_nanme = ?, password = ?, birthday = ?, update_timestamp = ?";
	//	private static final String SQL_UPDATE_DELETE_FLG = "UPDATE comic_info SET delete_flg = 0 WHERE delivery_user_id = ?";
	//	private static final String SQL_UPDATE_BALANCE = "UPDATE comic_info SET balance = ? WHERE delivery_user_id = ?";
	//	private static final String SQL_UPDATE_POINT = "UPDATE comic_info SET point = ? WHERE delivery_user_id = ?";

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public ComicInfoDao() {
		connection = DbUtil.getConnection();
	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	//  処理概要
	public List<ComicInfo> selectAll() {
		// 変数宣言
		List<ComicInfo>list = new ArrayList<ComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_ALL)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ComicInfo comic = new ComicInfo();

				comic.setComicId(rs.getInt("comic_id"));
//				comic.setAdminName(rs.getString("admin_name"));
//				comic.setPassword(rs.getString("password"));

				list.add(comic);
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/*---  Method End  ---*/
}

//comic_title
//number_of_turns
//introduction
//category_id
//base_price
//tax_id
//publisher_id
//comprehensive_evaluation
//release_date
//author_name
//image_data
//view_page
//insert_timestamp
//update_timestamp
//delete_flag
