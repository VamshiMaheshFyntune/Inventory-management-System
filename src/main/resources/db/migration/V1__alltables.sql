
CREATE TABLE users(
user_id BIGINT PRIMARY KEY,
username VARCHAR(255),
full_name VARCHAR(255),
password VARCHAR(255),
created_at TIMESTAMP NOT NULL,
role VARCHAR(50)
);

CREATE TABLE customers (
customer_id BIGINT PRIMARY KEY,
customer_name VARCHAR(255),
customer_number VARCHAR(50)
);

CREATE TABLE categories (
categories_id BIGINT PRIMARY KEY,
categories_name VARCHAR(255),
description TEXT,
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE products (
product_id BIGSERIAL  PRIMARY KEY,
product_name VARCHAR(255),
category_id BIGINT,
price NUMERIC(10, 2),
sku VARCHAR(100),
quantity INTEGER,
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
CONSTRAINT fk_category
FOREIGN KEY (category_id)
REFERENCES categories(categories_id)
);

CREATE TABLE suppliers (
    supplier_id BIGINT PRIMARY KEY,
    supplier_name VARCHAR(255),
    contact_name VARCHAR(255),
    email VARCHAR(255),
    phone NUMERIC,
    address TEXT,
    created_at TIMESTAMP

);

CREATE TABLE purchases (
purchase_id BIGINT PRIMARY KEY,
total_amount NUMERIC(12, 2),
created_at TIMESTAMP,
supplier_id BIGINT NOT NULL,
received_by BIGINT NOT NULL,
CONSTRAINT fk_supplier
FOREIGN KEY (supplier_id)
REFERENCES suppliers(supplier_id),
CONSTRAINT fk_received_by
FOREIGN KEY (received_by)
REFERENCES users(user_id)
);

CREATE TABLE purchase_items (
id BIGINT PRIMARY KEY,
purchase_id BIGINT,
product_id BIGINT,
quantity INTEGER,
price NUMERIC(12, 2),
CONSTRAINT fk_purchase
FOREIGN KEY (purchase_id)
REFERENCES purchases(purchase_id),
CONSTRAINT fk_product
FOREIGN KEY (product_id)
REFERENCES products(product_id)
);

CREATE TABLE sales (
sale_id BIGINT PRIMARY KEY,
customer_id BIGINT,
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
CONSTRAINT fk_customer
FOREIGN KEY (customer_id)
REFERENCES customers(customer_id)
);


CREATE TABLE sales_items (
sales_item_id BIGINT PRIMARY KEY,
sale_id BIGINT,
product_id BIGINT,
quantity INTEGER,
CONSTRAINT fk_sale
FOREIGN KEY (sale_id)
REFERENCES sales(sale_id),
CONSTRAINT fk_product
FOREIGN KEY (product_id)
REFERENCES products(product_id)
);

