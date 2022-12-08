CREATE TABLE IF NOT EXISTS inventory (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	store_id INT NOT NULL,
	goods_id INT NOT NULL,
	quantity INT,
	selling_price DOUBLE,
	CONSTRAINT fk_store_id FOREIGN KEY (store_id) REFERENCES store(store_id) ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT fk_goods_id FOREIGN KEY (goods_id) REFERENCES goods(goods_id) ON UPDATE CASCADE ON DELETE CASCADE
);

-- INSERT INTO inventory ( store_id, goods_id, quantity, selling_price)
-- VALUES
-- 	( 1,1,100,1.5 );