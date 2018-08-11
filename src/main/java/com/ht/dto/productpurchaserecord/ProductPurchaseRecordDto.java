package com.ht.dto.productpurchaserecord;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class ProductPurchaseRecordDto {		
	
	
	private String productName;
	
	
	private String purchaseDate;
	
	
	private String warrantyExpDate;
	
	
	private String boughtFrom;
	
	
	private String remarks;
	
	
	
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
