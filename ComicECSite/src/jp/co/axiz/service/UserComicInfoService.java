package jp.co.axiz.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
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

	public UserComicInfoService() {
	}

	public UserComicInfoService(HttpServletRequest request) {
		this.request = request;
	}

	public List<JoinUserComicInfo> selectByComicTitle() {
		String userId = request.getParameter("");
		String searchWord = request.getParameter("");
		List<JoinUserComicInfo> list = juci.bookShelfSearch(userId, searchWord);

		return list;
	}

	public List<JoinUserComicInfo> sort(String userId, String sortName) {
		if(sortName == null || sortName.equals("")) {
			sortName = "title";
		}
		List<JoinUserComicInfo> list = juci.bookShelfShow(userId, sortName);

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

	public void insertComic(String userId, Integer comicId) {
		LocalDateTime ldt = LocalDateTime.now();
		Timestamp purchaseTimestamp = Timestamp.valueOf(ldt);

		uci.insert(userId, comicId, purchaseTimestamp);

	}

}
