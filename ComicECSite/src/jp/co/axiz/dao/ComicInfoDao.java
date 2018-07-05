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
	private static final String SQL_SELECT_ALL =
		"SELECT * FROM comic_info";
	private static final String SQL_SELECT_WHERE_COMIC_TITLE =
		"SELECT * FROM comic_info ci LEFT OUTER JOIN "
		+ "category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN "
		+ "publisher pb ON ci.publisher_id = pb.publisher_id LEFT OUTER JOIN "
		+ "tax tax ON ci.tax_id = tax.tax_id WHERE comic_title = ?";
	private static final String SQL_SELECT_WHERE_AUTHOR =
		"SELECT * FROM comic_info ci LEFT OUTER JOIN "
		+ "category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN "
		+ "publisher pb ON ci.publisher_id = pb.publisher_id LEFT OUTER JOIN "
		+ "tax tax ON ci.tax_id = tax.tax_id WHERE author_name = ?";
	private static final String SQL_SELECT_WHERE_CATEGORY =
		"SELECT * FROM comic_info ci LEFT OUTER JOIN "
		+ "category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN "
		+ "publisher pb ON ci.publisher_id = pb.publisher_id LEFT OUTER JOIN "
		+ "tax tax ON ci.tax_id = tax.tax_id WHERE category_name = ?";
	private static final String SQL_SELECT_WHERE_SALEDAY =
		"SELECT * FROM comic_info ci LEFT OUTER JOIN "
		+ "category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN "
		+ "publisher pb ON ci.publisher_id = pb.publisher_id LEFT OUTER JOIN "
		+ "tax tax ON ci.tax_id = tax.tax_id WHERE release_date = ?";
	private static final String SQL_SELECT_WHERE_PUBLISHER =
		"SELECT * FROM comic_info ci LEFT OUTER JOIN "
		+ "category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN "
		+ "publisher pb ON ci.publisher_id = pb.publisher_id LEFT OUTER JOIN "
		+ "tax tax ON ci.tax_id = tax.tax_id WHERE publisher_name = ?";
	//	private static final String SQL_INSERT =
	//		"INSERT INTO comic_info VALUES (?, '0', ?, ?, ?, 0, 0, ?, '1970-01-01 00:00:00', 1)";
	//	private static final String SQL_UPDATE =
	//		"UPDATE comic_info SET delivery_user_id = ?, user_nanme = ?, password = ?, birthday = ?, update_timestamp = ?";
	//	private static final String SQL_UPDATE_DELETE_FLG =
	//		"UPDATE comic_info SET delete_flg = 0 WHERE delivery_user_id = ?";
	//	private static final String SQL_UPDATE_BALANCE =
	//		"UPDATE comic_info SET balance = ? WHERE delivery_user_id = ?";
	//	private static final String SQL_UPDATE_POINT =
	//		"UPDATE comic_info SET point = ? WHERE delivery_user_id = ?";

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public ComicInfoDao() {
		connection = DbUtil.getConnection();
	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	//  処理概要
	public List<ComicInfo> findAll() {
		// 変数宣言
		List<ComicInfo>list = new ArrayList<ComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_ALL)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ComicInfo comic = new ComicInfo(
						rs.getInt("comic_id"),
						rs.getString("comic_title"),
						rs.getInt("number_of_turns"),
						rs.getString("introduction"),
						rs.getInt("category_id"),
						rs.getInt("base_price"),
						rs.getInt("tax_id"),
						rs.getInt("publisher_id"),
						rs.getDouble("comprehensive_evaluation"),
						rs.getDate("release_date"),
						rs.getString("author_name"),
						rs.getString("image_data"),
						rs.getString("view_page"),
						rs.getString("insert_timestamp"),
						rs.getString("update_timestamp"),
						rs.getInt("delete_flag")
					);

				list.add(comic);
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<ComicInfo> findByComicTitle() {
		// 変数宣言
		List<ComicInfo>list = new ArrayList<ComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_COMIC_TITLE)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ComicInfo comic = new ComicInfo(
						rs.getInt("comic_id"),
						rs.getString("comic_title"),
						rs.getInt("number_of_turns"),
						rs.getString("introduction"),
						rs.getInt("category_id"),
						rs.getInt("base_price"),
						rs.getInt("tax_id"),
						rs.getInt("publisher_id"),
						rs.getDouble("comprehensive_evaluation"),
						rs.getDate("release_date"),
						rs.getString("author_name"),
						rs.getString("image_data"),
						rs.getString("view_page"),
						rs.getString("insert_timestamp"),
						rs.getString("update_timestamp"),
						rs.getInt("delete_flag")
					);

				list.add(comic);
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<ComicInfo> findByAuthor() {
		// 変数宣言
		List<ComicInfo>list = new ArrayList<ComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_AUTHOR)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ComicInfo comic = new ComicInfo(
						rs.getInt("comic_id"),
						rs.getString("comic_title"),
						rs.getInt("number_of_turns"),
						rs.getString("introduction"),
						rs.getInt("category_id"),
						rs.getInt("base_price"),
						rs.getInt("tax_id"),
						rs.getInt("publisher_id"),
						rs.getDouble("comprehensive_evaluation"),
						rs.getDate("release_date"),
						rs.getString("author_name"),
						rs.getString("image_data"),
						rs.getString("view_page"),
						rs.getString("insert_timestamp"),
						rs.getString("update_timestamp"),
						rs.getInt("delete_flag")
					);

				list.add(comic);
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<ComicInfo> findByCategory() {
		// 変数宣言
		List<ComicInfo>list = new ArrayList<ComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_CATEGORY)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ComicInfo comic = new ComicInfo(
						rs.getInt("comic_id"),
						rs.getString("comic_title"),
						rs.getInt("number_of_turns"),
						rs.getString("introduction"),
						rs.getInt("category_id"),
						rs.getInt("base_price"),
						rs.getInt("tax_id"),
						rs.getInt("publisher_id"),
						rs.getDouble("comprehensive_evaluation"),
						rs.getDate("release_date"),
						rs.getString("author_name"),
						rs.getString("image_data"),
						rs.getString("view_page"),
						rs.getString("insert_timestamp"),
						rs.getString("update_timestamp"),
						rs.getInt("delete_flag")
					);

				list.add(comic);
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<ComicInfo> findBySaleDay() {
		// 変数宣言
		List<ComicInfo>list = new ArrayList<ComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_SALEDAY)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ComicInfo comic = new ComicInfo(
						rs.getInt("comic_id"),
						rs.getString("comic_title"),
						rs.getInt("number_of_turns"),
						rs.getString("introduction"),
						rs.getInt("category_id"),
						rs.getInt("base_price"),
						rs.getInt("tax_id"),
						rs.getInt("publisher_id"),
						rs.getDouble("comprehensive_evaluation"),
						rs.getDate("release_date"),
						rs.getString("author_name"),
						rs.getString("image_data"),
						rs.getString("view_page"),
						rs.getString("insert_timestamp"),
						rs.getString("update_timestamp"),
						rs.getInt("delete_flag")
					);

				list.add(comic);
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<ComicInfo> findByPublisher() {
		// 変数宣言
		List<ComicInfo>list = new ArrayList<ComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_PUBLISHER)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ComicInfo comic = new ComicInfo(
						rs.getInt("comic_id"),
						rs.getString("comic_title"),
						rs.getInt("number_of_turns"),
						rs.getString("introduction"),
						rs.getInt("category_id"),
						rs.getInt("base_price"),
						rs.getInt("tax_id"),
						rs.getInt("publisher_id"),
						rs.getDouble("comprehensive_evaluation"),
						rs.getDate("release_date"),
						rs.getString("author_name"),
						rs.getString("image_data"),
						rs.getString("view_page"),
						rs.getString("insert_timestamp"),
						rs.getString("update_timestamp"),
						rs.getInt("delete_flag")
					);

				list.add(comic);
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/*---  Method End  ---*/
}
