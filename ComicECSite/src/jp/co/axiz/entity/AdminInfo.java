package jp.co.axiz.entity;

public class AdminInfo {
	/*---  Field  ---*/
	private String adminId;			//変数名概要
	private String adminName;		//変数名概要
	private String adminPassword;	//変数名概要

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public AdminInfo() {
	}

	public AdminInfo(String adminId, String adminName, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	//  処理概要
	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	/*---  Method End  ---*/
}
