package jp.co.axiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.axiz.entity.Publisher;
import jp.co.axiz.util.DbUtil;

public class PublisherDao {
	/*---  Field  ---*/
	private Connection connection;
	private static final String SQL_SELECT_ALL =
		"SELECT * FROM publisher ORDER BY publisher_id";
	private static final String SQL_SELECT_WHERE_CATEGORY_ID =
		"SELECT * FROM publisher WHERE publisher_id = ? ORDER BY publisher_id";
	private static final String SQL_SELECT_WHERE_CATEGORY_NAME =
		"SELECT * FROM publisher WHERE publisher_name = ? ORDER BY publisher_id";
	private static final String SQL_INSERT =
		"INSERT INTO publisher (publisher_name) VALUES (?)";
//	private static final String SQL_UPDATE =
//		"UPDATE publisher SET publisher_name = ? WHERE publisher_id = ?";
//	private static final String SQL_DELETE =
//		"DELETE FROM publisher WHERE publisher_id = ?";

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public PublisherDao() {
		connection = DbUtil.getConnection();
	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	/**
	 * 漫画カテゴリ全検索、リスト出力
	 *
	 * @return
	 */
	public List<Publisher> findAll() {
		// 変数宣言
		List<Publisher>list = new ArrayList<Publisher>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_ALL)) {
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Publisher publisher = new Publisher(
						rs.getInt("publisher_id"),
						rs.getString("publisher_name")
					);

				list.add(publisher);
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
	public List<Publisher> findByPublisherId(Integer publisherId) {
		// 変数宣言
		List<Publisher>list = new ArrayList<Publisher>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_CATEGORY_ID)) {
			stmt.setInt(1, publisherId);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Publisher publisher = new Publisher(
						rs.getInt("publisher_id"),
						rs.getString("publisher_name")
					);

				list.add(publisher);
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
	public List<Publisher> findByPublisherName(String publisherName) {
		// 変数宣言
		List<Publisher>list = new ArrayList<Publisher>();

		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_SELECT_WHERE_CATEGORY_NAME)) {
			stmt.setString(1, publisherName);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Publisher publisher = new Publisher(
						rs.getInt("publisher_id"),
						rs.getString("publisher_name")
					);
				list.add(publisher);
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
	public void insert(String publisherName) {
		// 変数宣言
		// 初期化

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_INSERT)) {
			stmt.setString(1, publisherName);
			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/*---  Method End  ---*/
}
