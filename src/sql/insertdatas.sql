INSERT INTO goods (goods_name) VALUES
('Apple'),
('Orange'),
('Banana'),
('Grapes'),
('Strawberry');

INSERT INTO store (store_name) VALUES
('Walmart'),
('Costco'),
('T&T'),
('Admin'),
('Supplier'),
('Deliver'),
('Customer');





INSERT INTO SYSTEM_USERS (logID, UserName, role, pwd, store_Name) VALUES (1, 'admin', 'admin', MD5(12345), 'Admin');
INSERT INTO SYSTEM_USERS (logID, UserName, role, pwd, store_Name) VALUES (2, 'WalmartManager', 'store_manager',  MD5(1234), 'Walmart');
INSERT INTO SYSTEM_USERS (logID, UserName, role, pwd, store_Name) VALUES (3, 'CostcoManager', 'store_manager',  MD5(1234), 'Costco');
INSERT INTO SYSTEM_USERS (logID, UserName, role, pwd, store_Name) VALUES (4, 'T&TManager', 'store_manager',  MD5(1234), 'T&T');
INSERT INTO SYSTEM_USERS (logID, UserName, role, pwd, store_Name) VALUES (5, 'store_manager', 'store_manager',  MD5(123), 'Walmart'); ##
INSERT INTO SYSTEM_USERS (logID, UserName, role, pwd, store_Name) VALUES (6, 'store_manager', 'store_manager',  MD5(123), 'Walmart'); ##


INSERT INTO SYSTEM_USERS (logID, UserName, role, pwd, store_Name) VALUES (3, 'Alin', 'customer',  MD5(123), 'Costco');
INSERT INTO SYSTEM_USERS (logID, UserName, role, pwd, store_Name) VALUES (4, 'supplier', 'supplier',  MD5(123), 'Safeway');
INSERT INTO SYSTEM_USERS (logID, UserName, role, pwd, store_Name) VALUES (5, 'delivery', 'delivery',  MD5(123), 'Kroger');
INSERT INTO SYSTEM_USERS (logID, UserName, role, pwd, store_Name) VALUES (6, 'admin2', 'admin',  MD5(12345), 'Target');
INSERT INTO SYSTEM_USERS (logID, UserName, role, pwd, store_Name) VALUES (7, 'Bob', 'customer',  MD5(123), 'Safeway');
INSERT INTO SYSTEM_USERS (logID, UserName, role, pwd, store_Name) VALUES (8, 'Cathy', 'customer',  MD5(123), 'Kroger');
INSERT INTO SYSTEM_USERS (logID, UserName, role, pwd, store_Name) VALUES (9, 'Delon', 'customer',  MD5(123), 'Target');
INSERT INTO SYSTEM_USERS (logID, UserName, role, pwd, store_Name) VALUES (10, 'Elon', 'customer',  MD5(123), 'Target');


INSERT INTO store_User (StoreUser_id, logID) VALUES (1, 1);
INSERT INTO store_User (StoreUser_id, logID) VALUES (2, 2);
INSERT INTO Customer (Customer_id, logID) VALUES (1, 3);
INSERT INTO Supplier_User (SupplierUser_id, logID) VALUES (1, 4);
INSERT INTO Delivery_User (SupplierUser_id, logID) VALUES (1, 5);
INSERT INTO store_User (StoreUser_id, logID) VALUES (3, 6);
INSERT INTO Customer (Customer_id, logID) VALUES (2, 7);
INSERT INTO Customer (Customer_id, logID) VALUES (3, 8);
INSERT INTO Customer (Customer_id, logID) VALUES (4, 9);
INSERT INTO Customer (Customer_id, logID) VALUES (5, 10);


 INSERT INTO delivery (delivery_NO, delivery_status, order_id, ETA, delivery_company, payment_time, shipped_time) VALUES
('20221208101112DELIVER', 'Pending', 1, NOW() + INTERVAL 50 SECOND, 'FedEx', NOW(), NOW() + INTERVAL 10 SECOND),
('20221208101112DELIVER', 'In Transit', 2, NOW() + INTERVAL 50 SECOND, 'UPS', NOW(), NOW() + INTERVAL 10 SECOND),
('20221208101112DELIVER', 'Delivered', 3, NOW() + INTERVAL 50 SECOND, 'DHL', NOW(), NOW() + INTERVAL 10 SECOND),
('20221208101112DELIVER', 'Cancelled', 4, NOW() + INTERVAL 50 SECOND, 'USPS', NOW(), NOW() + INTERVAL 10 SECOND),
('20221208101112DELIVER', 'Delayed', 5, NOW() + INTERVAL 50 SECOND, 'Aramex', NOW(), NOW() + INTERVAL 10 SECOND);

INSERT INTO `ORDER` (id, Customer_id, total_price, payment_method, delivery_id, store_ID, delivery_status) VALUES (1, 1, 100.00, 'Visa', 1, 1, 'pending');
INSERT INTO `ORDER` (id, Customer_id, total_price, payment_method, delivery_id, store_ID, delivery_status) VALUES (2, 2, 50.00, 'Mastercard', 2, 2, 'delivered');
INSERT INTO `ORDER` (id, Customer_id, total_price, payment_method, delivery_id, store_ID, delivery_status) VALUES (3, 3, 75.00, 'American Express', 3, 3, 'shipped');
INSERT INTO `ORDER` (id, Customer_id, total_price, payment_method, delivery_id, store_ID, delivery_status) VALUES (4, 4, 125.00, 'PayPal', 4, 4, 'cancelled');
INSERT INTO `ORDER` (id, Customer_id, total_price, payment_method, delivery_id, store_ID, delivery_status) VALUES (5, 5, 25.00, 'Venmo', 1, 2, 'pending');
