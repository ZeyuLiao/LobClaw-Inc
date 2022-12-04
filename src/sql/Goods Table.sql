CREATE TABLE IF NOT EXISTS goods (
	goods_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	goods_name VARCHAR ( 50 ) NOT NULL UNIQUE 
	
);
INSERT INTO goods ( goods_name)
VALUES
	( "Apple" ),
	( "Beef" ),
	( "Pizzas" ),
	( "Coke" ),
	( "T-shirt" ),
	( "Towel" ),
	( "Bottle" );