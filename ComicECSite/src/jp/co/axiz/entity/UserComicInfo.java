package jp.co.axiz.entity;

public class UserComicInfo {
	/*---  Field  ---*/
	private Integer userComicId;	//変数名概要
	private String userId;	//変数名概要
	private Integer comicId;	//変数名概要
	private Integer individualEvaluation;	//変数名概要
	private String purchaseTimestamp;	//変数名概要

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public UserComicInfo() {
	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	//  処理概要
	public Integer getUserComicId() {
		return userComicId;
	}

	public void setUserComicId(Integer userComicId) {
		this.userComicId = userComicId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getComicId() {
		return comicId;
	}

	public void setComicId(Integer comicId) {
		this.comicId = comicId;
	}

	public Integer getIndividualEvaluation() {
		return individualEvaluation;
	}

	public void setIndividualEvaluation(Integer individualEvaluation) {
		this.individualEvaluation = individualEvaluation;
	}

	public String getPurchaseTimestamp() {
		return purchaseTimestamp;
	}

	public void setPurchaseTimestamp(String purchaseTimestamp) {
		this.purchaseTimestamp = purchaseTimestamp;
	}

	/*---  Method End  ---*/
}
