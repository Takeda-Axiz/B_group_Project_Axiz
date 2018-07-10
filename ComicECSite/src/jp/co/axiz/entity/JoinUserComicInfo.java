package jp.co.axiz.entity;

import java.sql.Timestamp;

public class JoinUserComicInfo {

	//本棚機能で使用するカラムのみ

	private String userId;
	private Timestamp purchaseTimestamp;
	private Integer comicId;
	private String comicTitle;
	private Integer numberOfTurns;
	private String introduction;
	private String categoryName;
	private String publisherName;
	private double comprehensiveEvaluation;
	private String authorName;
	private String imageData;
	private String viewPage;

	public JoinUserComicInfo(String userId, Timestamp purchaseTimestamp, Integer comicId, String comicTitle,
			Integer numberOfTurns, String introduction, String categoryName, String publisherName,
			double comprehensiveEvaluation, String authorName, String imageData, String viewPage) {
		super();
		this.userId = userId;
		this.purchaseTimestamp = purchaseTimestamp;
		this.comicId = comicId;
		this.comicTitle = comicTitle;
		this.numberOfTurns = numberOfTurns;
		this.introduction = introduction;
		this.categoryName = categoryName;
		this.publisherName = publisherName;
		this.comprehensiveEvaluation = comprehensiveEvaluation;
		this.authorName = authorName;
		this.imageData = imageData;
		this.viewPage = viewPage;
	}

	public Integer getComicId() {
		return comicId;
	}

	public void setComicId(Integer comicId) {
		this.comicId = comicId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Timestamp getPurchaseTimestamp() {
		return purchaseTimestamp;
	}

	public void setPurchaseTimestamp(Timestamp purchaseTimestamp) {
		this.purchaseTimestamp = purchaseTimestamp;
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
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
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

	public double getComprehensiveEvaluation() {
		return comprehensiveEvaluation;
	}

	public void setComprehensiveEvaluation(double comprehensiveEvaluation) {
		this.comprehensiveEvaluation = comprehensiveEvaluation;
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
}
