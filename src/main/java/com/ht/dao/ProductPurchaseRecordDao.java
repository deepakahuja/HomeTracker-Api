package com.ht.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchaserecord")
public class ProductPurchaseRecordDao {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int pk;	
	
	@Column
	private String productName;
	
	@Column
	private String purchaseDate;
	
	@Column
	private String warrantyExpDate;
	
	@Column
	private String boughtFrom;
	
	@Column
	private String remarks;
	
	public int getPk() {
		return pk;
	}

	public void setPk(int pk) {
		this.pk = pk;
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getWarrantyExpDate() {
		return warrantyExpDate;
	}

	public void setWarrantyExpDate(String warrantyExpDate) {
		this.warrantyExpDate = warrantyExpDate;
	}

	public String getBoughtFrom() {
		return boughtFrom;
	}

	public void setBoughtFrom(String boughtFrom) {
		this.boughtFrom = boughtFrom;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
