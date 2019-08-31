/*Admin Modules Tables*/
create table ADMIN_CLIENTS(
	pk INT NOT NULL AUTO_INCREMENT, 
	client_name VARCHAR(50) NOT NULL, 	
	email VARCHAR(50) NOT NULL,
	phone INT(10) NOT NULL, 
    active TINYINT NOT NULL,
	created_by VARCHAR(50),
    updated_by VARCHAR(50),
    created_on TIMESTAMP,
    updated_on TIMESTAMP,
	PRIMARY KEY (pk)
);

create table ADMIN_USERS(
	pk INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
    fk_admin_clients INT NOT NULL,
	first_name VARCHAR(50) NOT NULL, 
	last_name VARCHAR(50) NOT NULL, 
	email VARCHAR(50) NOT NULL,
	phone INT(10) NOT NULL, 
    active TINYINT NOT NULL,
	created_by VARCHAR(50),
    updated_by VARCHAR(50),
    created_on TIMESTAMP,
    updated_on TIMESTAMP,
	FOREIGN KEY FK_ADMIN_CLIENTS(fk_admin_clients)
	REFERENCES ADMIN_CLIENTS(pk)
    ON DELETE RESTRICT
);


/*Old Tables, will analyze later if needed or not*/
create table PurchaseRecord(
	pk int NOT NULL AUTO_INCREMENT, 
	product_name VARCHAR(50) NOT NULL, 
	purchase_date DATE NOT NULL, 
	warranty_exp_date DATE, 
	bought_from VARCHAR(200) NOT NULL, 
	remarks VARCHAR(200),
	PRIMARY KEY (PK)
);