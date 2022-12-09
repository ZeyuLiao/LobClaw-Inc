#ZY
create table delivery(   #√
       id int not null PRIMARY KEY AUTO_INCREMENT,
			 delivery_NO VARCHAR(255) default (CONCAT(date_format(now(), "%Y%c%d%H%i%S"),"DELIVER")),
			 delivery_status VARCHAR(255) not NULL,
			 order_id int not null,
			 ETA VARCHAR(50) DEFAULT (NOW() + INTERVAL 50 second),
			 delivery_company VARCHAR(255) not null,
			 payment_time VARCHAR(50) not null,
			 shipped_time VARCHAR(50) DEFAULT (`payment_time` + INTERVAL 10 second)
);

#RL
CREATE TABLE IF NOT EXISTS goods (
	goods_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	goods_name VARCHAR ( 50 ) NOT NULL UNIQUE 
	
);


#RL
CREATE TABLE IF NOT EXISTS store (
	store_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	store_name VARCHAR(50) NOT NULL UNIQUE 
);

	
	
	#RL
CREATE TABLE IF NOT EXISTS inventory (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	store_id INT NOT NULL,
	goods_id INT NOT NULL,
	quantity DOUBLE not null,
	selling_price DOUBLE not null,
	CONSTRAINT fk_store_id FOREIGN KEY (store_id) REFERENCES store(store_id) ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_goods_id FOREIGN KEY (goods_id) REFERENCES goods(goods_id) ON UPDATE CASCADE ON DELETE CASCADE
);

-- INSERT INTO inventory ( store_id, goods_id, quantity, selling_price)
-- VALUES
-- 	( 1,1,100,1.5 );

create table if not EXISTS SYSTEM_USERS( #√
       logID INT PRIMARY KEY AUTO_INCREMENT,
			 UserName VARCHAR(255) UNIQUE not null,
			 role VARCHAR(50) not null,
			 pwd VARCHAR(50) not null,
			 store_Name VARCHAR(50) not null,
			 CONSTRAINT fk_SYSUSERS_storeName FOREIGN KEY (store_Name) REFERENCES store(store_Name) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE table if not EXISTS store_User(
       StoreUser_id int PRIMARY KEY AUTO_INCREMENT not null,
			 logID int not null,
			 CONSTRAINT fk_storeUser_logid FOREIGN KEY (logID) REFERENCES SYSTEM_USERS(logID) ON UPDATE CASCADE ON DELETE CASCADE

);


CREATE table if not EXISTS Customer(
       Customer_id int PRIMARY KEY AUTO_INCREMENT not null,
			 logID int not null,
			 CONSTRAINT fk_customer_logid FOREIGN KEY (logID) REFERENCES SYSTEM_USERS(logID) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE table if not EXISTS Supplier_User(
       SupplierUser_id int PRIMARY KEY AUTO_INCREMENT not null,
			 logID int not null,
			 CONSTRAINT fk_SupplierUser_logid FOREIGN KEY (logID) REFERENCES SYSTEM_USERS(logID) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE table if not EXISTS Delivery_User(
       SupplierUser_id int PRIMARY KEY AUTO_INCREMENT not null,
			 logID int not null,
			 CONSTRAINT fk_DeliveryUser_logid FOREIGN KEY (logID) REFERENCES SYSTEM_USERS(logID) ON UPDATE CASCADE ON DELETE CASCADE
);


CREATE table if not EXISTS `ORDER`(
       id int not null PRIMARY KEY AUTO_INCREMENT,
			 order_num VARCHAR(255) DEFAULT (date_format(now(), "%Y%c%d%H%i%S")),
			 Customer_id int not null,
			 CONSTRAINT fk_order_Customerid FOREIGN KEY (Customer_id) REFERENCES Customer(Customer_id),
			 total_price DOUBLE not null, 
			 payment_method VARCHAR(50) not null,
			 payment_time VARCHAR(50) DEFAULT (CURRENT_TIMESTAMP),
			 delivery_id int not null,
			 CONSTRAINT fk_order_deliveryid FOREIGN KEY (delivery_id) REFERENCES DELIVERY(id),
			 store_ID int not null,
			 CONSTRAINT fk_order_storeID FOREIGN KEY (store_ID) REFERENCES STORE(store_id),
			 delivery_status VARCHAR(255) not null #,
			 #CONSTRAINT fk_order_deliveryStatus FOREIGN KEY (delivery_status) REFERENCES DELIVERY(delivery_status)			 	 
);

create TABLE ORDER_DETAIL(
			 id int PRIMARY KEY not null AUTO_INCREMENT,
			 order_id INT not null,
			 CONSTRAINT fk_OrDe_orderid FOREIGN key (order_id) REFERENCES `ORDER`(id),
			 goods_id int not null,
			 CONSTRAINT fk_OrDe_goodsid FOREIGN KEY (goods_id) REFERENCES GOODS(goods_id),
			 goods_quantity int not null,
			 Unit_price double not null#,
			 #CONSTRAINT fk_OrDe_unitPrice FOREIGN KEY (Unit_price) REFERENCES Inventory(selling_price) 
);


CREATE table supply(
       demond_ID int PRIMARY KEY not null AUTO_INCREMENT,
			 demond_time VARCHAR(100) DEFAULT (CURRENT_TIMESTAMP),
			 store_ID int not null,
			 CONSTRAINT fk_supply_storeID FOREIGN KEY (store_ID) REFERENCES STORE(store_id)
			 
			 
);


create table supply_detail(
       id INT PRIMARY KEY not null AUTO_INCREMENT,
			 demond_ID INT not null,
			 CONSTRAINT FK_suppDetial_demondid FOREIGN KEY (demond_ID) REFERENCES supply(demond_ID),
			 goods_id int not null,
			 quantity int not null 
);


 




