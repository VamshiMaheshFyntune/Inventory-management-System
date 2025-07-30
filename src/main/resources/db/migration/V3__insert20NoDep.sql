-- Insert categories
INSERT INTO categories (categories_id, categories_name, description, created_at) VALUES
    (3, 'Clothing', 'Men and Women Clothing', CURRENT_TIMESTAMP),
    (4, 'Footwear', 'Shoes and Sandals', CURRENT_TIMESTAMP),
    (5, 'Books', 'Educational and Non-fiction', CURRENT_TIMESTAMP),
    (6, 'Toys', 'Children Toys', CURRENT_TIMESTAMP),
    (7, 'Stationery', 'Office and School Supplies', CURRENT_TIMESTAMP),
    (8, 'Kitchen', 'Kitchen Appliances', CURRENT_TIMESTAMP),
    (9, 'Mobile', 'Smartphones and Accessories', CURRENT_TIMESTAMP),
    (10, 'Groceries', 'Daily Essentials', CURRENT_TIMESTAMP),
    (11, 'Fitness', 'Fitness and Gym Equipment', CURRENT_TIMESTAMP),
    (12, 'Beauty', 'Beauty and Personal Care', CURRENT_TIMESTAMP),
    (13, 'Jewellery', 'Ornaments and Accessories', CURRENT_TIMESTAMP),
    (14, 'Gardening', 'Garden Tools and Plants', CURRENT_TIMESTAMP),
    (15, 'Automotive', 'Car and Bike Accessories', CURRENT_TIMESTAMP),
    (16, 'Music', 'Instruments and Equipment', CURRENT_TIMESTAMP),
    (17, 'Pets', 'Pet Food and Accessories', CURRENT_TIMESTAMP),
    (18, 'Lighting', 'Bulbs and Fixtures', CURRENT_TIMESTAMP),
    (19, 'Bags', 'Backpacks and Travel Bags', CURRENT_TIMESTAMP),
    (20, 'Gaming', 'Consoles and Accessories', CURRENT_TIMESTAMP);


-- Insert users
INSERT INTO users (user_id, username, full_name, password, role, created_at) VALUES
    (3, 'alice', 'Alice Johnson', 'alice123', 'STAFF', CURRENT_TIMESTAMP),
    (4, 'bob', 'Bob Smith', 'bob123', 'SUPPORT', CURRENT_TIMESTAMP),
    (5, 'carol', 'Carol White', 'carol123', 'MANAGER', CURRENT_TIMESTAMP),
    (6, 'david', 'David Brown', 'david123', 'STAFF', CURRENT_TIMESTAMP),
    (7, 'emma', 'Emma Wilson', 'emma123', 'STAFF', CURRENT_TIMESTAMP),
    (8, 'frank', 'Frank Thomas', 'frank123', 'ADMIN', CURRENT_TIMESTAMP),
    (9, 'grace', 'Grace Lee', 'grace123', 'SUPPORT', CURRENT_TIMESTAMP),
    (10, 'harry', 'Harry Patel', 'harry123', 'MANAGER', CURRENT_TIMESTAMP),
    (11, 'irene', 'Irene Sharma', 'irene123', 'STAFF', CURRENT_TIMESTAMP),
    (12, 'jack', 'Jack Desai', 'jack123', 'ADMIN', CURRENT_TIMESTAMP),
    (13, 'kate', 'Kate Reddy', 'kate123', 'STAFF', CURRENT_TIMESTAMP),
    (14, 'leo', 'Leo Kapoor', 'leo123', 'SUPPORT', CURRENT_TIMESTAMP),
    (15, 'maya', 'Maya Singh', 'maya123', 'MANAGER', CURRENT_TIMESTAMP),
    (16, 'nina', 'Nina Dubey', 'nina123', 'STAFF', CURRENT_TIMESTAMP),
    (17, 'omar', 'Omar Naik', 'omar123', 'SUPPORT', CURRENT_TIMESTAMP),
    (18, 'paul', 'Paul Mathew', 'paul123', 'STAFF', CURRENT_TIMESTAMP),
    (19, 'queen', 'Queen Das', 'queen123', 'MANAGER', CURRENT_TIMESTAMP),
    (20, 'raj', 'Raj Bhatt', 'raj123', 'STAFF', CURRENT_TIMESTAMP);

-- Insert suppliers
INSERT INTO suppliers (supplier_id, supplier_name, contact_name, email, phone, address, created_at) VALUES
    (3, 'Global Traders', 'Sunil Mehta', 'sunil@globaltraders.com', 9876543212, 'Delhi, DL', CURRENT_TIMESTAMP),
    (4, 'Smart Electronics', 'Ravi Sharma', 'ravi@smartelectronics.com', 9876543213, 'Mumbai, MH', CURRENT_TIMESTAMP),
    (5, 'Furniture World', 'Anita Joshi', 'anita@furnitureworld.com', 9876543214, 'Chennai, TN', CURRENT_TIMESTAMP),
    (6, 'Books India', 'Neha Agarwal', 'neha@booksindia.com', 9876543215, 'Kolkata, WB', CURRENT_TIMESTAMP),
    (7, 'Toy Zone', 'Pritam Roy', 'pritam@toyzone.com', 9876543216, 'Nagpur, MH', CURRENT_TIMESTAMP),
    (8, 'Kitchen Mart', 'Sheetal Jain', 'sheetal@kitchenmart.com', 9876543217, 'Surat, GJ', CURRENT_TIMESTAMP),
    (9, 'Gadget House', 'Aman Sinha', 'aman@gadgethouse.com', 9876543218, 'Pune, MH', CURRENT_TIMESTAMP),
    (10, 'Fitness Hub', 'Rohit Tiwari', 'rohit@fitnesshub.com', 9876543219, 'Ahmedabad, GJ', CURRENT_TIMESTAMP),
    (11, 'Beauty Lane', 'Pooja Nair', 'pooja@beautylane.com', 9876543220, 'Lucknow, UP', CURRENT_TIMESTAMP),
    (12, 'Pet World', 'Tina Dsouza', 'tina@petworld.com', 9876543221, 'Indore, MP', CURRENT_TIMESTAMP),
    (13, 'Auto Needs', 'Devendra Jain', 'devendra@autoneeds.com', 9876543222, 'Jaipur, RJ', CURRENT_TIMESTAMP),
    (14, 'Music Stop', 'Rahul Chopra', 'rahul@musicstop.com', 9876543223, 'Bhopal, MP', CURRENT_TIMESTAMP),
    (15, 'Light Up', 'Sneha Rathi', 'sneha@lightup.com', 9876543224, 'Noida, UP', CURRENT_TIMESTAMP),
    (16, 'GameTime', 'Yash Arora', 'yash@gametime.com', 9876543225, 'Thane, MH', CURRENT_TIMESTAMP),
    (17, 'Garden Store', 'Krishna Pillai', 'krishna@gardenstore.com', 9876543226, 'Coimbatore, TN', CURRENT_TIMESTAMP),
    (18, 'OfficeKart', 'Meena Iyer', 'meena@officekart.com', 9876543227, 'Nashik, MH', CURRENT_TIMESTAMP),
    (19, 'BagPoint', 'Tarun Vyas', 'tarun@bagpoint.com', 9876543228, 'Amritsar, PB', CURRENT_TIMESTAMP),
    (20, 'GrocerTown', 'Kavita Kaur', 'kavita@grocertown.com', 9876543229, 'Patna, BR', CURRENT_TIMESTAMP);

-- Insert customers
INSERT INTO customers (customer_id, customer_name, customer_number) VALUES
    (3, 'Amit Shah', '9000000003'),
    (4, 'Geeta Rani', '9000000004'),
    (5, 'Vikram Joshi', '9000000005'),
    (6, 'Nisha Kumari', '9000000006'),
    (7, 'Manoj Verma', '9000000007'),
    (8, 'Pooja Das', '9000000008');
    (9, 'Akash Mehra', '9000000009'),
    (10, 'Deepa Kumari', '9000000010'),
    (11, 'Imran Shaikh', '9000000011'),
    (12, 'Jyoti Rana', '9000000012'),
    (13, 'Karan Singh', '9000000013'),
    (14, 'Lata Joshi', '9000000014'),
    (15, 'Manish Patel', '9000000015'),
    (16, 'Neelam Desai', '9000000016'),
    (17, 'Omkar Yadav', '9000000017'),
    (18, 'Preeti Saxena', '9000000018'),
    (19, 'Rohan Mishra', '9000000019'),
    (20, 'Sneha Sharma', '9000000020');