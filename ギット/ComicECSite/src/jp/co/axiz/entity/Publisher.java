package jp.co.axiz.entity;

public class Publisher {
	/*---  Field  ---*/
	private Integer publisherId;
	private String publisherName;	//変数名概要

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public Publisher() {
	}

	public Publisher(Integer publisherId, String publisherName) {
		super();
		this.publisherId = publisherId;
		this.publisherName = publisherName;
	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	//  処理概要
	public Integer getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Integer publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	/*---  Method End  ---*/
}
