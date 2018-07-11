package jp.co.axiz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jp.co.axiz.entity.JoinUserComicInfo;
import jp.co.axiz.util.DbUtil;

public class JoinUserComicInfoDao {

	private Connection connection;
	private static final String SQL_SELECT_WHERE_USER_ID_ORDER_BY_COMIC_TITLE =
			"SELECT uc.user_id, uc.purchase_timestamp, uc.comic_id, ci.comic_title, ci.number_of_turns, ci.introduction, ct.category_name, pb.publisher_name, ci.comprehensive_evaluation, ci.author_name, ci.image_data, ci.view_page" +
					"	 FROM (user_comic_info uc LEFT OUTER JOIN comic_info ci ON uc.comic_id = ci.comic_id) LEFT OUTER JOIN category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN publisher pb ON ci.publisher_id = pb.publisher_id" +
					"	 WHERE user_id = ?" +
					"	 ORDER BY comic_title";
	private static final String SQL_SELECT_WHERE_USER_ID_ORDER_BY_CATEGORY_NAME =
			"SELECT uc.user_id, uc.purchase_timestamp, uc.comic_id, ci.comic_title, ci.number_of_turns, ci.introduction, ct.category_name, pb.publisher_name, ci.comprehensive_evaluation, ci.author_name, ci.image_data, ci.view_page" +
					"	 FROM (user_comic_info uc LEFT OUTER JOIN comic_info ci ON uc.comic_id = ci.comic_id) LEFT OUTER JOIN category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN publisher pb ON ci.publisher_id = pb.publisher_id" +
					"	 WHERE user_id = ?" +
					"	 ORDER BY category_name";
	private static final String SQL_SELECT_WHERE_USER_ID_ORDER_BY_AUTHOR_NAME =
			"SELECT uc.user_id, uc.purchase_timestamp, uc.comic_id, ci.comic_title, ci.number_of_turns, ci.introduction, ct.category_name, pb.publisher_name, ci.comprehensive_evaluation, ci.author_name, ci.image_data, ci.view_page" +
					"	 FROM (user_comic_info uc LEFT OUTER JOIN comic_info ci ON uc.comic_id = ci.comic_id) LEFT OUTER JOIN category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN publisher pb ON ci.publisher_id = pb.publisher_id" +
					"	 WHERE user_id = ?" +
					"	 ORDER BY author_name";
	private static final String SQL_SELECT_WHERE_USER_ID_ORDER_BY_PURCHASE_TIMESTAMP =
			"SELECT uc.user_id, uc.purchase_timestamp, uc.comic_id, ci.comic_title, ci.number_of_turns, ci.introduction, ct.category_name, pb.publisher_name, ci.comprehensive_evaluation, ci.author_name, ci.image_data, ci.view_page" +
					"	 FROM (user_comic_info uc LEFT OUTER JOIN comic_info ci ON uc.comic_id = ci.comic_id) LEFT OUTER JOIN category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN publisher pb ON ci.publisher_id = pb.publisher_id" +
					"	 WHERE user_id = ?" +
					"	 ORDER BY purchase_timestamp";
	private static final String SQL_SELECT_WHERE_COMIC_TITLE_LIKE =
			"SELECT uc.user_id, uc.purchase_timestamp, uc.comic_id, ci.comic_title, ci.number_of_turns, ci.introduction, ct.category_name, pb.publisher_name, ci.comprehensive_evaluation, ci.author_name, ci.image_data, ci.view_page" +
					"	 FROM (user_comic_info uc LEFT OUTER JOIN comic_info ci ON uc.comic_id = ci.comic_id) LEFT OUTER JOIN category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN publisher pb ON ci.publisher_id = pb.publisher_id" +
					"	 WHERE user_id = ? AND comic_title LIKE ?" +
					"	 ORDER BY comic_title";
	private static final String SQL_SELECT_WHERE_USER_ID_AND_COMIC_ID =
			"SELECT uc.user_id, uc.purchase_timestamp, uc.comic_id, ci.comic_title, ci.number_of_turns, ci.introduction, ct.category_name, pb.publisher_name, ci.comprehensive_evaluation, ci.author_name, ci.image_data, ci.view_page" +
					"	 FROM (user_comic_info uc LEFT OUTER JOIN comic_info ci ON uc.comic_id = ci.comic_id) LEFT OUTER JOIN category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN publisher pb ON ci.publisher_id = pb.publisher_id" +
					"	 WHERE user_id = ? AND comic_id = ?";
	private static final String SQL_SELECT_WHERE_COMIC_TITLE =
			"SELECT uc.user_id, uc.purchase_timestamp, uc.comic_id, ci.comic_title, ci.number_of_turns, ci.introduction, ct.category_name, pb.publisher_name, ci.comprehensive_evaluation, ci.author_name, ci.image_data, ci.view_page" +
					"	 FROM (user_comic_info uc LEFT OUTER JOIN comic_info ci ON uc.comic_id = ci.comic_id) LEFT OUTER JOIN category ct ON ci.category_id = ct.category_id LEFT OUTER JOIN publisher pb ON ci.publisher_id = pb.publisher_id" +
					"	 WHERE comic_title = ?";
	private static final String SQL_UPDATE_SET_INDIVIDUAL_EVALUATION =
			"UPDATE user_comic_info AS uc" +
					"	 SET individual_evaluation = ?" +
					"	 FROM comic_info AS ci" +
					"	 WHERE uc.comic_id = ci.comic_id" +
					"	 AND uc.user_id = ? AND ci.comic_title = ?";

	public JoinUserComicInfoDao() {
		connection = DbUtil.getConnection();
	}

	//DAOメソッド

		//LIKE検索の注意事項
		//プレースホルダ(？の事)は前後にシングルクォーテーションをつけるため、「+ "%"」という風に記述する

	public List<JoinUserComicInfo> bookShelfShow(String userId, String sortName) {
		List<JoinUserComicInfo> list = new ArrayList<>();
		String SQL= null ;
		switch(sortName) {
		case "title":
			SQL = SQL_SELECT_WHERE_USER_ID_ORDER_BY_COMIC_TITLE;
		case "category":
			SQL = SQL_SELECT_WHERE_USER_ID_ORDER_BY_CATEGORY_NAME;
		case "author":
			SQL = SQL_SELECT_WHERE_USER_ID_ORDER_BY_AUTHOR_NAME;
		case "release_date":
			SQL = SQL_SELECT_WHERE_USER_ID_ORDER_BY_PURCHASE_TIMESTAMP;
		}
		try(PreparedStatement stmt = connection.prepareStatement(SQL)) {
			stmt.setString(1, userId);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				JoinUserComicInfo u = new JoinUserComicInfo(
						rs.getString("user_id"),
						rs.getTimestamp("purchase_timestamp"),
						rs.getInt("comic_id"),
						rs.getString("comic_title"),
						rs.getInt("number_of_turns"),
						rs.getString("introduction"),
						rs.getString("category_name"),
						rs.getString("publisher_name"),
						rs.getDouble("comprehensive_evaluation"),
						rs.getString("author_name"),
						rs.getString("image_data"),
						rs.getString("view_page"));
				list.add(u);
			}

		}catch(SQLException e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return list;

	}

	public List<JoinUserComicInfo> bookShelfSearch(String userId, String searchWord) {
		List<JoinUserComicInfo> list = new ArrayList<>();
		try(PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_WHERE_COMIC_TITLE_LIKE)) {
			stmt.setString(1, userId);
			stmt.setString(2, searchWord + "%");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				JoinUserComicInfo u = new JoinUserComicInfo(
						rs.getString("user_id"),
						rs.getTimestamp("purchase_timestamp"),
						rs.getInt("comic_id"),
						rs.getString("comic_title"),
						rs.getInt("number_of_turns"),
						rs.getString("introduction"),
						rs.getString("category_name"),
						rs.getString("publisher_name"),
						rs.getDouble("comprehensive_evaluation"),
						rs.getString("author_name"),
						rs.getString("image_data"),
						rs.getString("view_page"));
				list.add(u);
			}

		}catch(SQLException e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return list;
	}

	public List<JoinUserComicInfo> comicDetailShow(String userId, Integer comicId) {
		List<JoinUserComicInfo> list = new ArrayList<>();
		try(PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_WHERE_USER_ID_AND_COMIC_ID)) {
			stmt.setString(1, userId);
			stmt.setInt(2, comicId);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				JoinUserComicInfo u = new JoinUserComicInfo(
						rs.getString("user_id"),
						rs.getTimestamp("purchase_timestamp"),
						rs.getInt("comic_id"),
						rs.getString("comic_title"),
						rs.getInt("number_of_turns"),
						rs.getString("introduction"),
						rs.getString("category_name"),
						rs.getString("publisher_name"),
						rs.getDouble("comprehensive_evaluation"),
						rs.getString("author_name"),
						rs.getString("image_data"),
						rs.getString("view_page"));
				list.add(u);
			}

		}catch(SQLException e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return list;
	}

	public List<JoinUserComicInfo> findByComicTitle(String comicTitle) {
		List<JoinUserComicInfo> list = new ArrayList<>();
		try(PreparedStatement stmt = connection.prepareStatement(SQL_SELECT_WHERE_COMIC_TITLE)) {
			stmt.setString(1, comicTitle);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				JoinUserComicInfo u = new JoinUserComicInfo(
						rs.getString("user_id"),
						rs.getTimestamp("purchase_timestamp"),
						rs.getInt("comic_id"),
						rs.getString("comic_title"),
						rs.getInt("number_of_turns"),
						rs.getString("introduction"),
						rs.getString("category_name"),
						rs.getString("publisher_name"),
						rs.getDouble("comprehensive_evaluation"),
						rs.getString("author_name"),
						rs.getString("image_data"),
						rs.getString("view_page"));
				list.add(u);
			}

		}catch(SQLException e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return list;
	}

	public void updateIndividualEvaluation(Integer individualEvaluation, String userId, Integer comicId) {
		try(PreparedStatement stmt = connection.prepareStatement(SQL_UPDATE_SET_INDIVIDUAL_EVALUATION)) {
			stmt.setInt(1, individualEvaluation);
			stmt.setString(2, userId);
			stmt.setInt(3, comicId);
			stmt.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
