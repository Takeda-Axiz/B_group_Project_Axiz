package jp.co.axiz.dao;

import java.sql.Connection;
import java.sql.Date;
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
	private static final String SQL_SELECT_COMIC_TITLE =
		"SELECT * FROM comic_info ci LEFT OUTER JOIN "
		+ "category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN "
		+ "publisher pb ON ci.publisher_id = pb.publisher_id LEFT OUTER JOIN "
		+ "tax tax ON ci.tax_id = tax.tax_id ORDER BY comic_title";
	private static final String SQL_SELECT_AUTHOR =
			"SELECT * FROM comic_info ci LEFT OUTER JOIN "
			+ "category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN "
			+ "publisher pb ON ci.publisher_id = pb.publisher_id LEFT OUTER JOIN "
			+ "tax tax ON ci.tax_id = tax.tax_id ORDER BY author_name";
	private static final String SQL_SELECT_CATEGORY =
			"SELECT * FROM comic_info ci LEFT OUTER JOIN "
			+ "category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN "
			+ "publisher pb ON ci.publisher_id = pb.publisher_id LEFT OUTER JOIN "
			+ "tax tax ON ci.tax_id = tax.tax_id";
	private static final String SQL_SELECT_SALEDAY =
			"SELECT * FROM comic_info ci LEFT OUTER JOIN "
			+ "category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN "
			+ "publisher pb ON ci.publisher_id = pb.publisher_id LEFT OUTER JOIN "
			+ "tax tax ON ci.tax_id = tax.tax_id";
	private static final String SQL_SELECT_PUBLISHER =
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
		+ "tax tax ON ci.tax_id = tax.tax_id WHERE category_name LIKE ? ORDER BY ct.category_id";
	private static final String SQL_SELECT_WHERE_SALEDAY =
		"SELECT * FROM comic_info ci LEFT OUTER JOIN "
		+ "category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN "
		+ "publisher pb ON ci.publisher_id = pb.publisher_id LEFT OUTER JOIN "
		+ "tax tax ON ci.tax_id = tax.tax_id WHERE release_date LIKE ? ORDER BY sale_day";
	private static final String SQL_SELECT_WHERE_PUBLISHER =
		"SELECT * FROM comic_info ci LEFT OUTER JOIN "
		+ "category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN "
		+ "publisher pb ON ci.publisher_id = pb.publisher_id LEFT OUTER JOIN "
		+ "tax tax ON ci.tax_id = tax.tax_id WHERE publisher_name LIKE ? ORDER BY pb.publisher_id";

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public JoinComicInfoDao() {
		connection = DbUtil.getConnection();
	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	//  処理概要
	public List<JoinComicInfo> findAllSortComicTitle() {
		// 変数宣言
		List<JoinComicInfo> list = new ArrayList<JoinComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_COMIC_TITLE)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// 削除済みかどうか確認
				if(rs.getInt("delete_flag") == 0) {
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
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<JoinComicInfo> findAllSortAuthor() {
		// 変数宣言
		List<JoinComicInfo> list = new ArrayList<JoinComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_AUTHOR)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// 削除済みかどうか確認
				if(rs.getInt("delete_flag") == 0) {
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
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<JoinComicInfo> findAllSortCategory() {
		// 変数宣言
		List<JoinComicInfo> list = new ArrayList<JoinComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_CATEGORY)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// 削除済みかどうか確認
				if(rs.getInt("delete_flag") == 0) {
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
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<JoinComicInfo> findAllSortSaleDay() {
		// 変数宣言
		List<JoinComicInfo> list = new ArrayList<JoinComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_SALEDAY)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// 削除済みかどうか確認
				if(rs.getInt("delete_flag") == 0) {
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
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<JoinComicInfo> findAllSortPublisher() {
		// 変数宣言
		List<JoinComicInfo> list = new ArrayList<JoinComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_PUBLISHER)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// 削除済みかどうか確認
				if(rs.getInt("delete_flag") == 0) {
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
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<JoinComicInfo> findByComicTitle(String comicTitle) {
		// 変数宣言
		List<JoinComicInfo> list = new ArrayList<JoinComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_COMIC_TITLE)) {
			stmt.setString(1, comicTitle);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// 削除済みかどうか確認
				if(rs.getInt("delete_flag") == 0) {
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
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<JoinComicInfo> findByAuthor(String author) {
		// 変数宣言
		List<JoinComicInfo> list = new ArrayList<JoinComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_AUTHOR)) {
			stmt.setString(1, author);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// 削除済みかどうか確認
				if(rs.getInt("delete_flag") == 0) {
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
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<JoinComicInfo> findByCategory(String category) {
		// 変数宣言
		List<JoinComicInfo> list = new ArrayList<JoinComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_CATEGORY)) {
			stmt.setString(1, category);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// 削除済みかどうか確認
				if(rs.getInt("delete_flag") == 0) {
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
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<JoinComicInfo> findBySaleDay(Date releaseDate) {
		// 変数宣言
		List<JoinComicInfo> list = new ArrayList<JoinComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_SALEDAY)) {
			stmt.setDate(1, releaseDate);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// 削除済みかどうか確認
				if(rs.getInt("delete_flag") == 0) {
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
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//  処理概要
	public List<JoinComicInfo> findByPublisher(String publisher) {
		// 変数宣言
		List<JoinComicInfo> list = new ArrayList<JoinComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_PUBLISHER)) {
			stmt.setString(1, publisher);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// 削除済みかどうか確認
				if(rs.getInt("delete_flag") == 0) {
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
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/*---  Method End  ---*/
}
