package jp.co.axiz.entity;

import java.sql.Date;

public class ComicInfo {
	/*---  Field  ---*/
	private Integer comicId;	//変数名概要
	private String comicTitle;	//変数名概要
	private Integer numberOfTurns;	//変数名概要
	private String Introduction;	//変数名概要
	private Integer categoryId;	//変数名概要
	private Integer basePrice;	//変数名概要
	private Integer taxId;	//変数名概要
	private Integer publisherId;	//変数名概要
	private Double comprehensiveEvaluation;	//変数名概要
	private Date releaseDate;	//変数名概要
	private String authorName;	//変数名概要
	private String imageData;	//変数名概要
	private String viewPage;	//変数名概要
	private String insertTimestamp;	//変数名概要
	private String updateTimestamp;	//変数名概要
	private Integer deleteFlag;	//変数名概要

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public ComicInfo() {

	}

	public ComicInfo(Integer comicId, String comicTitle, Integer numberOfTurns, String introduction, Integer categoryId,
			Integer basePrice, Integer taxId, Integer publisherId, Double comprehensiveEvaluation, Date releaseDate,
			String authorName, String imageData, String viewPage, String insertTimestamp, String updateTimestamp,
			Integer deleteFlag) {
		super();
		this.comicId = comicId;
		this.comicTitle = comicTitle;
		this.numberOfTurns = numberOfTurns;
		this.Introduction = introduction;
		this.categoryId = categoryId;
		this.basePrice = basePrice;
		this.taxId = taxId;
		this.publisherId = publisherId;
		this.comprehensiveEvaluation = comprehensiveEvaluation;
		this.releaseDate = releaseDate;
		this.authorName = authorName;
		this.imageData = imageData;
		this.viewPage = viewPage;
		this.insertTimestamp = insertTimestamp;
		this.updateTimestamp = updateTimestamp;
		this.deleteFlag = deleteFlag;
	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	//  処理概要
	public Integer getComicId() {
		return comicId;
	}

	public void setComicId(Integer comicId) {
		this.comicId = comicId;
	}

	public String getComicTitle() {
		return comicTitle;
	}

	public void setComicTitle(String comicTitle) {
		this.comicTitle = comicTitle;
	}

	public Integer getNumberOfTurns() {
		return numberOfTurns;
	}

	public void setNumberOfTurns(Integer numberOfTurns) {
		this.numberOfTurns = numberOfTurns;
	}

	public String getIntroduction() {
		return Introduction;
	}

	public void setIntroduction(String introduction) {
		Introduction = introduction;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Integer basePrice) {
		this.basePrice = basePrice;
	}

	public Integer getTaxId() {
		return taxId;
	}

	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}

	public Integer getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}

	public Double getComprehensiveEvaluation() {
		return comprehensiveEvaluation;
	}

	public void setComprehensiveEvaluation(Double comprehensiveEvaluation) {
		this.comprehensiveEvaluation = comprehensiveEvaluation;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getImageData() {
		return imageData;
	}

	public void setImageData(String imageData) {
		this.imageData = imageData;
	}

	public String getViewPage() {
		return viewPage;
	}

	public void setViewPage(String viewPage) {
		this.viewPage = viewPage;
	}

	public String getInsertTimestamp() {
		return insertTimestamp;
	}

	public void setInsertTimestamp(String insertTimestamp) {
		this.insertTimestamp = insertTimestamp;
	}

	public String getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(String updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public Integer getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/*---  Method End  ---*/
}
