package jp.co.axiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.axiz.entity.JoinComicInfo;
import jp.co.axiz.util.DbUtil;

public class JoinComicInfoDao {
	/*---  Field  ---*/
	private Connection connection;
	private static final String SQL_SELECT_ALL =
		"SELECT * FROM comic_info ci LEFT OUTER JOIN "
		+ "category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN "
		+ "publisher pb ON ci.publisher_id = pb.publisher_id LEFT OUTER JOIN "
		+ "tax tax ON ci.tax_id = tax.tax_id";
	private static final String SQL_SELECT_WHERE_COMIC_TITLE =
		"SELECT * FROM comic_info ci LEFT OUTER JOIN "
		+ "category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN "
		+ "publisher pb ON ci.publisher_id = pb.publisher_id LEFT OUTER JOIN "
		+ "tax tax ON ci.tax_id = tax.tax_id WHERE comic_title LIKE ? ORDER BY comic_title";
	private static final String SQL_SELECT_WHERE_AUTHOR =
		"SELECT * FROM comic_info ci LEFT OUTER JOIN "
		+ "category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN "
		+ "publisher pb ON ci.publisher_id = pb.publisher_id LEFT OUTER JOIN "
		+ "tax tax ON ci.tax_id = tax.tax_id WHERE author_name LIKE ? ORDER BY author_name";
	private static final String SQL_SELECT_WHERE_CATEGORY =
		"SELECT * FROM comic_info ci LEFT OUTER JOIN "
		+ "category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN "
		+ "publisher pb ON ci.publisher_id = pb.publisher_id LEFT OUTER JOIN "
		+ "tax tax ON ci.tax_id = tax.tax_id WHERE category_name LIKE ? ORDER BY category_id";
	private static final String SQL_SELECT_WHERE_SALEDAY =
		"SELECT * FROM comic_info ci LEFT OUTER JOIN "
		+ "category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN "
		+ "publisher pb ON ci.publisher_id = pb.publisher_id LEFT OUTER JOIN "
		+ "tax tax ON ci.tax_id = tax.tax_id WHERE release_date LIKE ? ORDER BY sale_day";
	private static final String SQL_SELECT_WHERE_PUBLISHER =
		"SELECT * FROM comic_info ci LEFT OUTER JOIN "
		+ "category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN "
		+ "publisher pb ON ci.publisher_id = pb.publisher_id LEFT OUTER JOIN "
		+ "tax tax ON ci.tax_id = tax.tax_id WHERE publisher_name LIKE ? ORDER BY publisher_id";

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public JoinComicInfoDao() {
		connection = DbUtil.getConnection();
	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	//  処理概要
	public List<JoinComicInfo> findAll() {
		// 変数宣言
		List<JoinComicInfo>list = new ArrayList<JoinComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_ALL)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				JoinComicInfo comic = new JoinComicInfo(
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
						rs.getInt("delete_flag"),
						rs.getString("category_name"),
						rs.getString("publisher_name"),
						rs.getDouble("tax"),
						rs.getDate("introduction_date")
					);

				list.add(comic);
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<JoinComicInfo> findByComicTitle() {
		// 変数宣言
		List<JoinComicInfo>list = new ArrayList<JoinComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_COMIC_TITLE)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				JoinComicInfo comic = new JoinComicInfo(
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
						rs.getInt("delete_flag"),
						rs.getString("category_name"),
						rs.getString("publisher_name"),
						rs.getDouble("tax"),
						rs.getDate("introduction_date")
					);

				list.add(comic);
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<JoinComicInfo> findByAuthor() {
		// 変数宣言
		List<JoinComicInfo>list = new ArrayList<JoinComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_AUTHOR)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				JoinComicInfo comic = new JoinComicInfo(
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
						rs.getInt("delete_flag"),
						rs.getString("category_name"),
						rs.getString("publisher_name"),
						rs.getDouble("tax"),
						rs.getDate("introduction_date")
					);

				list.add(comic);
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<JoinComicInfo> findByCategory() {
		// 変数宣言
		List<JoinComicInfo>list = new ArrayList<JoinComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_CATEGORY)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				JoinComicInfo comic = new JoinComicInfo(
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
						rs.getInt("delete_flag"),
						rs.getString("category_name"),
						rs.getString("publisher_name"),
						rs.getDouble("tax"),
						rs.getDate("introduction_date")
					);

				list.add(comic);
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<JoinComicInfo> findBySaleDay() {
		// 変数宣言
		List<JoinComicInfo>list = new ArrayList<JoinComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_SALEDAY)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				JoinComicInfo comic = new JoinComicInfo(
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
						rs.getInt("delete_flag"),
						rs.getString("category_name"),
						rs.getString("publisher_name"),
						rs.getDouble("tax"),
						rs.getDate("introduction_date")
					);

				list.add(comic);
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<JoinComicInfo> findByPublisher() {
		// 変数宣言
		List<JoinComicInfo>list = new ArrayList<JoinComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_PUBLISHER)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				JoinComicInfo comic = new JoinComicInfo(
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
						rs.getInt("delete_flag"),
						rs.getString("category_name"),
						rs.getString("publisher_name"),
						rs.getDouble("tax"),
						rs.getDate("introduction_date")
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
