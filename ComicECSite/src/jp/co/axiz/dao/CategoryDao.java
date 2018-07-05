package jp.co.axiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.axiz.entity.Category;
import jp.co.axiz.util.DbUtil;

public class CategoryDao {
	/*---  Field  ---*/
	private Connection connection;
	private static final String SQL_SELECT_ALL =
		"SELECT * FROM category ORDER BY category_id";
	private static final String SQL_SELECT_WHERE_CATEGORY_ID =
		"SELECT * FROM category WHERE category_id = ? ORDER BY category_id";
	private static final String SQL_SELECT_WHERE_CATEGORY_NAME =
		"SELECT * FROM category WHERE category_name = ? ORDER BY category_id";
	private static final String SQL_INSERT =
		"INSERT INTO category (category_name) VALUES (?)";
//	private static final String SQL_UPDATE =
//		"UPDATE category SET category_name = ? WHERE category_id = ?";
//	private static final String SQL_DELETE =
//		"DELETE FROM category WHERE category_id = ?";

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public CategoryDao() {
		connection = DbUtil.getConnection();
	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	/**
	 * 漫画カテゴリ全検索、リスト出力
	 *
	 * @return
	 */
	public List<Category> findAll() {
		// 変数宣言
		List<Category>list = new ArrayList<Category>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_ALL)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Category category = new Category(
						rs.getInt("category_id"),
						rs.getString("category_name")
					);

				list.add(category);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}

	/**
	 * 漫画カテゴリID検索、リスト出力
	 *
	 * @return
	 */
	public List<Category> findByCategoryId(Integer categoryId) {
		// 変数宣言
		List<Category>list = new ArrayList<Category>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_CATEGORY_ID)) {
			stmt.setInt(1, categoryId);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Category category = new Category(
						rs.getInt("category_id"),
						rs.getString("category_name")
					);

				list.add(category);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}

	/**
	 * 漫画カテゴリ名検索、リスト出力
	 *
	 * @return
	 */
	public List<Category> findByCategoryName(String categoryName) {
		// 変数宣言
		List<Category>list = new ArrayList<Category>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_CATEGORY_NAME)) {
			stmt.setString(1, categoryName);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Category category = new Category(
						rs.getInt("category_id"),
						rs.getString("category_name")
					);
				list.add(category);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}

	/**
	 * 漫画カテゴリ登録
	 *
	 * @return
	 */
	public void insert(String categoryName) {
		// 変数宣言
		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_INSERT)) {
			stmt.setString(1, categoryName);
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/*---  Method End  ---*/
}
