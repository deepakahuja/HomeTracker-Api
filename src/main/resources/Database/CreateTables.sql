create table PurchaseRecord(
	pk int NOT NULL AUTO_INCREMENT, 
	product_name VARCHAR(50) NOT NULL, 
	purchase_date DATE NOT NULL, 
	warranty_exp_date DATE, 
	bought_from VARCHAR(200) NOT NULL, 
	remarks VARCHAR(200),
	PRIMARY KEY (PK)
);