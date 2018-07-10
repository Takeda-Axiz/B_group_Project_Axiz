package jp.co.axiz.service;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import jp.co.axiz.common.CommonMethod;
import jp.co.axiz.dao.ComicInfoDao;
import jp.co.axiz.dao.JoinComicInfoDao;
import jp.co.axiz.entity.ComicInfo;
import jp.co.axiz.entity.JoinComicInfo;

public class ComicInfoService {
	/*---  Field  ---*/
	private ComicInfoDao cID = new ComicInfoDao();				//変数名概要
	private JoinComicInfoDao jCID = new JoinComicInfoDao();	//変数名概要
	private String nowTimeStamp;								//変数名概要

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public ComicInfoService() {
		this.nowTimeStamp = CommonMethod.getTimeStamp();
	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	//  処理概要
	public List<JoinComicInfo> searchComicInfo(String pullDownInfo, String formInfo) {
		// 変数宣言
		List<JoinComicInfo> list = null;
		java.util.Date formDate = null;
		java.sql.Date sqlFormDate = null;
		SimpleDateFormat sDF = null;

		// 初期化
		formInfo = CommonMethod.resetNull(formInfo);

		if(formInfo == "") {
			switch(pullDownInfo) {
			case "title":
				list = jCID.findAllSortComicTitle();
				break;
			case "author":
				list = jCID.findAllSortAuthor();
				break;
			case "category":
				list = jCID.findAllSortCategory();
				break;
			case "saleDay":
				list = jCID.findAllSortSaleDay();
				break;
			case "publisher":
				list = jCID.findAllSortPublisher();
				break;
			default:
				break;
			}
		}else {
			switch(pullDownInfo) {
			case "title":
				list = jCID.findByComicTitle(formInfo);
				break;
			case "author":
				list = jCID.findByAuthor(formInfo);
				break;
			case "category":
				list = jCID.findByCategory(formInfo);
				break;
			case "saleDay":
				if(formDate == null) {
					sDF = new SimpleDateFormat("yyyyMMdd");

					try {
						formDate = sDF.parse(formInfo);
					}catch(ParseException e) {
						formDate = null;
					}
				}

				if(formDate == null) {
					sDF = new SimpleDateFormat("yyyy-MM-dd");

					try {
						formDate = sDF.parse(formInfo);
					}catch(ParseException e) {
						formDate = null;
					}
				}

				if(formDate == null) {
					sDF = new SimpleDateFormat("yyyy/MM/dd");

					try {
						formDate = sDF.parse(formInfo);
					}catch(ParseException e) {
						formDate = null;
					}
				}

				if(formDate == null) {
					sDF = new SimpleDateFormat("yyyy年MM月dd日");

					try {
						formDate = sDF.parse(formInfo);
					}catch(ParseException e) {
						formDate = null;
					}
				}

				if(formDate != null) {
					sqlFormDate = new java.sql.Date(formDate.getTime());
					list = jCID.findBySaleDay(sqlFormDate);
				}
				break;
			case "publisher":
				list = jCID.findByPublisher(formInfo);
				break;
			default:
				break;
			}
		}
		return list;
	}

	public ComicInfo findComicInfo(Integer comicId){
		// 変数宣言
		// 初期化

		return cID.findById(comicId);
	}

	//  処理概要
	public void insert(String comicTitle, Integer numberOfTurns, String categoryName, Integer basePrice, String publisherName, String imageData, String viewPage, Date releaseDate, String authorName, String introduction) {
		// 変数宣言
		// 初期化

		cID.insert(comicTitle, numberOfTurns, categoryName, basePrice, publisherName, imageData, viewPage, releaseDate, authorName, introduction, this.nowTimeStamp);
	}

	//  処理概要
	public void updateComicInfo(Integer comicId, String comicTitle, Integer numberOfTurns, String categoryName, Integer basePrice, String publisherName, String imageData, String viewPage, Date releaseDate, String authorName, String introduction) {
		// 変数宣言
		// 初期化

		cID.updateComicInfo(comicId, comicTitle, numberOfTurns, categoryName, basePrice, publisherName, imageData, viewPage, releaseDate, authorName, introduction, this.nowTimeStamp);
	}

	//  処理概要
	public void evaluateUpdate(Integer comicId) {
		// 変数宣言
		// 初期化

		cID.updateEvaluate(comicId);
	}

	//  処理概要
	public void deleteComicInfo(Integer comicId) {
		// 変数宣言
		// 初期化

		cID.logicalDelete(comicId);
	}

	/*---  Method End  ---*/
}
