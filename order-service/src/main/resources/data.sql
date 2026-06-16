INSERT INTO orders (order_status, total_price) VALUES
('PENDING', 149.99),
('CONFIRMED', 89.50),
('CANCELLED', 59.99),
('DELIVERED', 120.75),
('CONFIRMED', 249.00);


INSERT INTO order_item (product_id, quantity, order_id) VALUES
(1, 2, 1),
(2, 1, 1),
(3, 4, 2),
(4, 1, 3),
(5, 2, 3),
(6, 3, 4),
(7, 5, 5);