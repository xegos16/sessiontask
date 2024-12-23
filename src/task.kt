CREATE TABLE employees (
id SERIAL PRIMARY KEY,
name VARCHAR(255),
position VARCHAR(255)
);

CREATE TABLE departments (
id SERIAL PRIMARY KEY,
name VARCHAR(255),
location VARCHAR(255)
);

CREATE TABLE projects (
id SERIAL PRIMARY KEY,
name VARCHAR(255),
start_date DATE,
end_date DATE
);

CREATE TABLE clients (
id SERIAL PRIMARY KEY,
name VARCHAR(255),
contact_info VARCHAR(255)
);

CREATE TABLE invoices (
id SERIAL PRIMARY KEY,
client_id INT,
amount DECIMAL(10, 2),
due_date DATE
);

CREATE TABLE payments (
id SERIAL PRIMARY KEY,
invoice_id INT,
payment_date DATE,
amount DECIMAL(10, 2)
);

CREATE TABLE products (
id SERIAL PRIMARY KEY,
name VARCHAR(255),
price DECIMAL(10, 2)
);

CREATE TABLE orders (
id SERIAL PRIMARY KEY,
product_id INT,
quantity INT,
order_date DATE
);

CREATE TABLE suppliers (
id SERIAL PRIMARY KEY,
name VARCHAR(255),
contact_info VARCHAR(255)
);

CREATE TABLE shipments (
id SERIAL PRIMARY KEY,
order_id INT,
shipment_date DATE,
delivery_date DATE
);

CREATE TABLE employees_projects (
id SERIAL PRIMARY KEY,
employee_id INT,
project_id INT
);

CREATE TABLE salaries (
id SERIAL PRIMARY KEY,
employee_id INT,
amount DECIMAL(10, 2),
payment_date DATE
);

CREATE TABLE attendance (
id SERIAL PRIMARY KEY,
employee_id INT,
date DATE,
status VARCHAR(255)
);

CREATE TABLE assets (
id SERIAL PRIMARY KEY,
name VARCHAR(255),
value DECIMAL(10, 2)
);

CREATE TABLE maintenance (
id SERIAL PRIMARY KEY,
asset_id INT,
maintenance_date DATE,
description TEXT
);

