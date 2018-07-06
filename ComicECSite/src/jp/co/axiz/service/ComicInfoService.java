package jp.co.axiz.service;

import java.util.List;

import jp.co.axiz.dao.ComicInfoDao;
import jp.co.axiz.dao.JoinComicInfoDao;
import jp.co.axiz.entity.ComicInfo;

public class ComicInfoService {
	/*---  Field  ---*/
	private ComicInfoDao cID = new ComicInfoDao();				//変数名概要
	private JoinComicInfoDao jCID = new JoinComicInfoDao();	//変数名概要

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public ComicInfoService() {
	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	//  処理概要
	public List<ComicInfo> findComicInfo() {


		return null;
	}

	/*---  Method End  ---*/
}
