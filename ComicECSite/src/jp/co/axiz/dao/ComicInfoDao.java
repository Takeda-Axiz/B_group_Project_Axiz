package jp.co.axiz.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.axiz.entity.Category;
import jp.co.axiz.entity.ComicInfo;
import jp.co.axiz.entity.Publisher;
import jp.co.axiz.util.DbUtil;

public class ComicInfoDao {
	/*---  Field  ---*/
	private Connection connection;
	private static final String SQL_SELECT_ALL =
		"SELECT * FROM comic_info";
	private static final String SQL_INSERT =
		"INSERT INTO comic_info (comic_title, number_of_turns, introduction, category_id, "
		+ "base_price, tax_id, publisher_id, comprehensive_evaluation, release_date, "
		+ "author_name, image_data, view_page, insert_timestamp, update_timestamp, delete_flag) "
		+ "VALUES (?, ?, ?, (SELECT category_id FROM category WHERE category_name = ?), ?, '1', (SELECT publisher_id FROM publisher WHERE publisher_name = ?), ?, ?, ?, ?, ?, ?, '1970-01-01 00:00:00', '0')";
	// (comicId, comicTitle, numberOfTurns, introduction, categoryId, basePrice, taxId, publisherId, comprehensiveEvaluation, releaseDate, authorName, imageData, viewPage, insertTimestamp, updateTimestamp, deleteFlag)
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
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return list;
	}

	/**
	 * 漫画情報登録
	 *
	 * @return
	 */
	public void insert(String title, String category, Integer price,
			String publisher, Integer evaluation, Date releaseDate,
			String author, String introduction, String timeStamp) {
		// 変数宣言
		Integer categoryId;
		Integer publisherId;
		List<Category> listCategory;
		List<Publisher> listPublisher;

		CategoryDao categoryDao = new CategoryDao();
		PublisherDao publisherDao = new PublisherDao();

		// 初期化

		listCategory = categoryDao.findByCategoryName(category);

		if(listCategory == null) {
			categoryDao.insert(category);
		}
		categoryId = listCategory.get(0).getCategoryId();

		listPublisher = publisherDao.findByPublisherName(publisher);

		if(listPublisher == null) {
			publisherDao.insert(publisher);
		}
		publisherId = (Integer) listPublisher.get(0).getPublisherId();

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_INSERT)) {
			stmt.setString(1, title);			// 1
			stmt.setString(2, introduction);	// 8
			stmt.setInt(3, categoryId);			// 2
			stmt.setInt(4, price);				// 3
			stmt.setInt(5, publisherId);		// 4
			stmt.setInt(6, evaluation);			// 5
			stmt.setDate(7, releaseDate);		// 6
			stmt.setString(8, author);			// 7
			stmt.setString(9, timeStamp);		// 9

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
	public void update(Integer comicId, String title, String category, Integer price, String publisher,
			Integer evaluation, Date releaseDate, String author, String introduction) {
		// 変数宣言
		Integer categoryId;
		Integer publisherId;
		List<Category> listCategory;
		List<Publisher> listPublisher;

		CategoryDao categoryDao = new CategoryDao();
		PublisherDao publisherDao = new PublisherDao();

		// 初期化

		listCategory = categoryDao.findByCategoryName(category);

		if(listCategory == null) {
			categoryDao.insert(category);
		}
		categoryId = listCategory.get(0).getCategoryId();

		listPublisher = publisherDao.findByPublisherName(publisher);

		if(listPublisher == null) {
			publisherDao.insert(publisher);
		}
		publisherId = (Integer) listPublisher.get(0).getPublisherId();

		try (PreparedStatement stmt = connection.prepareStatement
				(SQL_INSERT)) {
			stmt.setString(1, title);			// 1
			stmt.setString(2, introduction);	// 8
			stmt.setInt(3, categoryId);			// 2
			stmt.setInt(4, price);				// 3
			stmt.setInt(5, publisherId);		// 4
			stmt.setInt(6, evaluation);			// 5
			stmt.setDate(7, releaseDate);		// 6
			stmt.setString(8, author);			// 7

			stmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/*---  Method End  ---*/
}
