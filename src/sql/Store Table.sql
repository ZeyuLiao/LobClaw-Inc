CREATE TABLE IF NOT EXISTS store (
	store_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	store_name VARCHAR ( 50 ) NOT NULL UNIQUE 
	
);
INSERT INTO store ( store_name )
VALUES
	( "Loblaws" ),
	( "Metro" ),
	( "Dollarama" ),
	( "T&T" );