-- Insert categories
INSERT INTO categories (categories_id, categories_name, description, created_at) VALUES
  (1, 'Electronics', 'Electronic items', CURRENT_TIMESTAMP),
  (2, 'Furniture', 'Home and Office Furniture', CURRENT_TIMESTAMP);

-- Insert users
INSERT INTO users (user_id, username, full_name, password, role, created_at) VALUES
  (1, 'admin', 'Admin User', 'admin123', 'ADMIN', CURRENT_TIMESTAMP),
  (2, 'john', 'John Doe', 'john123', 'STAFF', CURRENT_TIMESTAMP);

-- Insert suppliers
INSERT INTO suppliers (supplier_id, supplier_name, contact_name, email, phone, address, created_at) VALUES
  (1, 'Tech Supplies Inc.', 'Ankit Mehra', 'ankit@techsupplies.com', 9876543210, 'Bangalore, KA', CURRENT_TIMESTAMP),
  (2, 'OfficeDepot', 'Suresh Rao', 'suresh@officedepot.com', 9876543211, 'Hyderabad, TS', CURRENT_TIMESTAMP);

-- Insert customers
INSERT INTO customers (customer_id, customer_name, customer_number) VALUES
  (1, 'Ramesh Kumar', '9000000001'),
  (2, 'Sita Devi', '9000000002');

-- Insert products
INSERT INTO product (product_id, product_name, category_id, price, sku, quantity, created_at) VALUES
  (1, 'Dell Laptop', 1, 55000.00, 'SKU-DL-001', 10, CURRENT_TIMESTAMP),
  (2, 'Wooden Chair', 2, 3500.00, 'SKU-WC-002', 25, CURRENT_TIMESTAMP);

-- Insert purchases
INSERT INTO purchases (purchase_id, total_amount, created_at, supplier_id, received_by) VALUES
  (1, 110000.00, CURRENT_TIMESTAMP, 1, 1);

-- Insert purchase_item
INSERT INTO purchase_items (id, purchase_id, product_id, quantity, price) VALUES
  (1, 1, 1, 2, 55000.00);

-- Insert sales
INSERT INTO sales (sale_id, customer_id, created_at) VALUES
  (1, 1, CURRENT_TIMESTAMP);

-- Insert sales_items
INSERT INTO sales_items (sales_item_id, sale_id, product_id, quantity) VALUES
  (1, 1, 1, 1);
