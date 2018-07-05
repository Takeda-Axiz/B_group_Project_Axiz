package jp.co.axiz.entity;

import java.sql.Date;

public class JoinComicInfo {
	/*---  Field  ---*/
	private Integer comicId;					// 漫画ID
	private String comicTitle;					// 漫画タイトル
	private Integer numberOfTurns;				// 巻数
	private String Introduction;				// 紹介文
	private Integer categoryId;					// カテゴリID
	private Integer basePrice;					// 原価
	private Integer taxId;						// 消費税ID
	private Integer publisherId;				// 出版社ID
	private Double comprehensiveEvaluation;		// 総合評価
	private Date releaseDate;					// 発売日
	private String authorName;					// 原作者名
	private String imageData;					// 表紙画像データ
	private String viewPage;					// 閲覧用URL
	private String insertTimestamp;				// 登録日時
	private String updateTimestamp;				// 更新日時
	private Integer deleteFlag;					// 削除フラグ

	private String categoryName;				// カテゴリ名
	private String publisherName;				// 出版社名
	private Double tax;							// 消費税
	private Date introductionDate;				// 導入日

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public JoinComicInfo() {
	}

	public JoinComicInfo(Integer comicId, String comicTitle, Integer numberOfTurns, String introduction,
			Integer categoryId, Integer basePrice, Integer taxId, Integer publisherId, Double comprehensiveEvaluation,
			Date releaseDate, String authorName, String imageData, String viewPage, String insertTimestamp,
			String updateTimestamp, Integer deleteFlag, String categoryName, String publisherName, Double tax,
			Date introductionDate) {
		super();
		this.comicId = comicId;
		this.comicTitle = comicTitle;
		this.numberOfTurns = numberOfTurns;
		Introduction = introduction;
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
		this.categoryName = categoryName;
		this.publisherName = publisherName;
		this.tax = tax;
		this.introductionDate = introductionDate;
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

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Date getIntroductionDate() {
		return introductionDate;
	}

	public void setIntroductionDate(Date introductionDate) {
		this.introductionDate = introductionDate;
	}

	/*---  Method End  ---*/

}
