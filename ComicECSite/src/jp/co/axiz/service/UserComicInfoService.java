package jp.co.axiz.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jp.co.axiz.dao.JoinUserComicInfoDao;
import jp.co.axiz.dao.UserComicInfoDao;
import jp.co.axiz.entity.JoinUserComicInfo;

public class UserComicInfoService {

	UserComicInfoDao uci = new UserComicInfoDao();
	JoinUserComicInfoDao juci = new JoinUserComicInfoDao();
	HttpServletRequest request;

	public UserComicInfoService(HttpServletRequest request) {
		this.request = request;
	}

	public List<JoinUserComicInfo> selectByComicTitle() {
		String userId = request.getParameter("");
		String searchWord = request.getParameter("");
		List<JoinUserComicInfo> list = juci.bookShelfSearch(userId, searchWord);

		return list;
	}

	public List<JoinUserComicInfo> sort() {
		String userId = request.getParameter("");
		String SortNumber = request.getParameter("");
		Integer sortNumber = Integer.parseInt(SortNumber);
		List<JoinUserComicInfo> list = juci.bookShelfShow(userId, sortNumber);

		return list;
	}

	public List<JoinUserComicInfo> comicDetail() {
		String userId = request.getParameter("");
		String comicTitle = request.getParameter("");
		List<JoinUserComicInfo> list = juci.comicDetailShow(userId, comicTitle);

		return list;

	}

	public void updateEvaluation() {
		String IndividualEvaluation = request.getParameter("");
		Integer individualEvaluation = Integer.parseInt(IndividualEvaluation);
		String userId = request.getParameter("");
		String comicTitle = request.getParameter("");
		juci.updateIndividualEvaluation(individualEvaluation, userId, comicTitle);
	}

	public void insertComic() {
		String userId = request.getParameter("");
		String ComicId = request.getParameter("");
		Integer comicId = Integer.parseInt(ComicId);
		LocalDateTime ldt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String purchaseTimestamp = dtf.format(ldt);

		uci.insert(userId, comicId, purchaseTimestamp);

	}

}
