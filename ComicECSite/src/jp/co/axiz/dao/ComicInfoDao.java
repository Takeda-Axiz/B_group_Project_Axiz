package jp.co.axiz.dao;

import java.sql.Connection;
import java.sql.Date;
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
		"SELECT * FROM comic_info ORDER BY comic_id";
	private static final String SQL_SELECT_WHERE_ID =
			"SELECT * FROM comic_info WHERE comic_id = ? ORDER BY comic_id";
	private static final String SQL_INSERT =
		"INSERT INTO comic_info (comic_title, number_of_turns, introduction, category_id, "
		+ "base_price, tax_id, publisher_id, comprehensive_evaluation, release_date, "
		+ "author_name, image_data, view_page, insert_timestamp, update_timestamp, delete_flag) "
		+ "VALUES (?, ?, ?, (SELECT category_id FROM category WHERE category_name = ?), ?, '1', "
		+ "(SELECT publisher_id FROM publisher WHERE publisher_name = ?), '', ?, ?, ?, ?, ?, "
		+ "'1970-01-01 00:00:00', '0')";
	private static final String SQL_UPDATE_COMIC_INFO =
		"UPDATE comic_info SET comic_title = ?, number_of_turns = ?, introduction = ?, category_id = "
		+ "(SELECT category_id FROM category WHERE category_name = ?), base_price = ?, "
		+ "publisher_id = (SELECT publisher_id FROM publisher WHERE publisher_name = ?), "
		+ "release_date = ?, author_name = ?, image_data = ?, "
		+ "view_page = ?, update_timestamp = ? WHERE comic_id = ?";
	private static final String SQL_UPDATE_EVALUATE =
		"UPDATE comic_info SET comprehensive_evaluation = ? WHERE comic_id = ?";
	private static final String SQL_UPDATE_DELETE_FLG =
		"UPDATE comic_info SET delete_flg = 1 WHERE comic_id = ?";

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public ComicInfoDao() {
		connection = DbUtil.getConnection();
	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	/**
	 * 漫画全検索、リスト出力
	 *
	 * @return
	 */
	public List<ComicInfo> findAll() {
		// 変数宣言
		List<ComicInfo>list = new ArrayList<ComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_ALL)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				if(rs.getInt("delete_flag") == 0) {
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
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}

	/**
	 * 漫画全検索、リスト出力
	 *
	 * @return
	 */
	public ComicInfo findById(Integer comicId) {
		// 変数宣言
		List<ComicInfo>list = new ArrayList<ComicInfo>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_ID)) {
			stmt.setInt(1, comicId);	// 1
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				if(rs.getInt("delete_flag") == 0) {
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
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		if(list.isEmpty()) {
			return null;
		}else {
			return list.get(0);
		}
	}

	/**
	 * 漫画情報登録
	 *
	 * @return
	 */
	public void insert(String title, String numberOfTurns, String category,
			Integer price, String publisher, String imgPath, String viewPath,
			Date releaseDate, String author, String introduction,
			String timeStamp) {
		// 変数宣言
		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_INSERT)) {
			stmt.setString(1, title);			// 1
			stmt.setString(2, numberOfTurns);	// 2
			stmt.setString(3, introduction);	// 10
			stmt.setString(4, category);		// 3
			stmt.setInt(5, price);				// 4
			stmt.setString(6, publisher);		// 5
			stmt.setDate(7, releaseDate);		// 8
			stmt.setString(8, author);			// 9
			stmt.setString(9, imgPath);			// 6
			stmt.setString(10, viewPath);		// 7
			stmt.setString(11, timeStamp);		// 11

			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 漫画情報更新
	 *
	 * @return
	 */
	public void updateComicInfo(Integer comicId, String title, Integer numberOfTurns,
			String category, Integer price, String publisher, String imgPath,
			String viewPath, Date releaseDate, String author, String introduction,
			String timeStamp) {
		// 変数宣言
		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_UPDATE_COMIC_INFO)) {
			stmt.setString(1, title);			// 2
			stmt.setInt(2, numberOfTurns);	// 3
			stmt.setString(3, introduction);	// 11
			stmt.setString(4, category);		// 4
			stmt.setInt(5, price);				// 5
			stmt.setString(6, publisher);		// 6
			stmt.setDate(7, releaseDate);		// 9
			stmt.setString(8, author);			// 10
			stmt.setString(9, imgPath);			// 7
			stmt.setString(10, viewPath);		// 8
			stmt.setString(11, timeStamp);		// 12
			stmt.setInt(12, comicId);			// 1

			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 漫画情報更新
	 *
	 * @return
	 */
	public void updateEvaluate(Integer comicId, Double evaluate) {
		// 変数宣言
		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_UPDATE_EVALUATE)) {
			stmt.setDouble(1, evaluate);		// 2
			stmt.setInt(2, comicId);			// 1

			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * 漫画情報論理削除
	 *
	 * @return
	 */
	public void logicalDelete(Integer comicId) {
		// 変数宣言
		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_UPDATE_DELETE_FLG)) {
			stmt.setInt(1, comicId);			// 1

			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/*---  Method End  ---*/
}
