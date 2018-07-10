package jp.co.axiz.service;

import java.util.BitSet;

import jp.co.axiz.dao.AdminInfoDao;
import jp.co.axiz.entity.AdminInfo;

public class AdminLoginService {
	/*---  Field  ---*/
	private AdminInfoDao aID = new AdminInfoDao();		//変数名概要

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public AdminLoginService() {
	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	//  処理概要
	public AdminInfo isMatchPass(String adminId, String password) {
		// 変数宣言
		AdminInfo adminInfo = null;
		BitSet chkFlg = new BitSet();

		// 初期化

		adminInfo = aID.findById(adminId);

		if(adminId.equals(adminInfo.getAdminId())) {
			chkFlg.set(0);
		}

		if(password.equals(adminInfo.getAdminPassword())) {
			chkFlg.set(1);
		}

		if(chkFlg.cardinality() >= 2) {
			return adminInfo;
		}else {
			return null;
		}
	}

	/*---  Method End  ---*/
}
