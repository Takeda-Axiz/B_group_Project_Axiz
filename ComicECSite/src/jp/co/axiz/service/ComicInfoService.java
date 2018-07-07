package jp.co.axiz.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import jp.co.axiz.common.CommonMethod;
import jp.co.axiz.dao.JoinComicInfoDao;
import jp.co.axiz.entity.JoinComicInfo;

public class ComicInfoService {
	/*---  Field  ---*/
	private JoinComicInfoDao jCID = new JoinComicInfoDao();	//変数名概要

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public ComicInfoService() {
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

	/*---  Method End  ---*/
}
