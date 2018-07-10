package jp.co.axiz.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jp.co.axiz.dao.ComicInfoDao;
import jp.co.axiz.dao.JoinUserComicInfoDao;
import jp.co.axiz.dao.UserComicInfoDao;
import jp.co.axiz.entity.JoinUserComicInfo;

public class UserComicInfoService {

	UserComicInfoDao uci = new UserComicInfoDao();
	JoinUserComicInfoDao juci = new JoinUserComicInfoDao();
	ComicInfoDao ci = new ComicInfoDao();
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
		String ComicId = request.getParameter("");
		Integer comicId = Integer.parseInt(ComicId);
		List<JoinUserComicInfo> list = juci.comicDetailShow(userId, comicId);

		return list;

	}

	public void updateEvaluation() {
		String IndividualEvaluation = request.getParameter("");
		Integer individualEvaluation = Integer.parseInt(IndividualEvaluation);
		String userId = request.getParameter("");
		String ComicId = request.getParameter("");
		Integer comicId = Integer.parseInt(ComicId);
		//まず個人評価の更新を行う
		juci.updateIndividualEvaluation(individualEvaluation, userId, comicId);
		//次に総合評価の更新を行う
		ci.updateEvaluate(comicId);


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
