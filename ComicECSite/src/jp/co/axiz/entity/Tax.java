package jp.co.axiz.entity;

import java.sql.Date;

public class Tax {
	/*---  Field  ---*/
	private Integer taxId;	//変数名概要
	private Double tax;	//変数名概要
	private Date introductionDate;	//変数名概要

	/*---  Field End  ---*/

	/*---  Constructor  ---*/
	//  処理概要
	public Tax() {
	}

	public Tax(Integer taxId, Double tax, Date introductionDate) {
		super();
		this.taxId = taxId;
		this.tax = tax;
		this.introductionDate = introductionDate;
	}

	/*---  Constructor End  ---*/

	/*---  Method  ---*/
	//  処理概要
	public Integer getTaxId() {
		return taxId;
	}

	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
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
