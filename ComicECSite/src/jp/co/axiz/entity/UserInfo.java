package jp.co.axiz.entity;

import java.sql.Date;

public class UserInfo {
	/*---  Field  ---*/
	private String userId;	//変数名概要
	private String deliveryUserId;	//変数名概要
	private String userName;	//変数名概要
	private String password;	//変数名概要
	private Date birthday;	//変数名概要
	private Integer balance;	//変数名概要
	private Integer point;	//変数名概要
	private String insertTimestamp;	//変数名概要
	private String updateTimestamp;	//変数名概要
	private Integer deleteFlg;	//変数名概要

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public UserInfo() {
	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	//  処理概要
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDeliveryUserId() {
		return deliveryUserId;
	}

	public void setDeliveryUserId(String deliveryUserId) {
		this.deliveryUserId = deliveryUserId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
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

	public Integer getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(Integer deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	/*---  Method End  ---*/
}
